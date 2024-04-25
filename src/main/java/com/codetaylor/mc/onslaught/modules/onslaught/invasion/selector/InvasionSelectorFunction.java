package com.codetaylor.mc.onslaught.modules.onslaught.invasion.selector;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.annotation.Nullable;

import com.codetaylor.mc.athenaeum.util.WeightedPicker;
import com.codetaylor.mc.onslaught.ModOnslaught;
import com.codetaylor.mc.onslaught.modules.onslaught.ModuleOnslaughtConfig;
import com.codetaylor.mc.onslaught.modules.onslaught.template.invasion.InvasionTemplate;

import net.minecraft.entity.player.EntityPlayerMP;

/** Responsible for selecting an invasion for the given player. */
public class InvasionSelectorFunction implements Function<EntityPlayerMP, String> {

	private final Supplier<Stream<Map.Entry<String, InvasionTemplate>>> invasionTemplateStreamSupplier;
	private final Predicate<String> invasionTemplateExistsPredicate;
	private final Supplier<String> fallbackInvasionSupplier;

	public InvasionSelectorFunction(
			Supplier<Stream<Map.Entry<String, InvasionTemplate>>> invasionTemplateStreamSupplier,
			Predicate<String> invasionTemplateExistsPredicate, Supplier<String> fallbackInvasionSupplier) {

		this.invasionTemplateStreamSupplier = invasionTemplateStreamSupplier;
		this.invasionTemplateExistsPredicate = invasionTemplateExistsPredicate;
		this.fallbackInvasionSupplier = fallbackInvasionSupplier;
	}

	/**
	 * Filter invasions by dimension and gamestage then select a qualified invasion
	 * by weight.
	 *
	 * @param player the player to select for
	 * @return the invasion id
	 */
	@Nullable
	@Override
	public String apply(EntityPlayerMP player) {

		final WeightedPicker<Map.Entry<String, InvasionTemplate>> picker = new WeightedPicker<>(player.getRNG());

		// Filter invasions by dimension and gamestage
		// Select remaining invasions by weight

		this.invasionTemplateStreamSupplier.get().filter(new SelectorFilterDimension(new DimensionSupplier(player)))
				.filter(new SelectorFilterGamestages(player))
				.forEach(entry -> picker.add(entry.getValue().selector.weight, entry));

		if (picker.getSize() == 0) {
			// Ensure that the fallback invasion exists else return null
			String fallbackInvasion = this.fallbackInvasionSupplier.get();
			boolean invasionTemplateExists = this.invasionTemplateExistsPredicate.test(fallbackInvasion);

			if (invasionTemplateExists) {

				if (ModuleOnslaughtConfig.DEBUG.INVASION_SELECTOR) {
					String message = String.format("Selected invasion %s for player %s", fallbackInvasion,
							player.getName());
					ModOnslaught.LOG.debug(message);
					System.out.println(message);
				}

				return fallbackInvasion;

			} else {
				String message = String.format(
						"Missing the fallback invasion defined in config, skipping invasion for player %s",
						player.getName());
				ModOnslaught.LOG.error(message);
				return null;
			}

		} else {
			String invasion = picker.get().getKey();

			if (ModuleOnslaughtConfig.DEBUG.INVASION_SELECTOR) {
				String message = String.format("Selected invasion %s for player %s", invasion, player.getName());
				ModOnslaught.LOG.debug(message);
			}

			return invasion;
		}
	}
}
