package pkg.deepCurse.old.onslaught;

import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

import com.codetaylor.mc.onslaught.ModOnslaught;
import com.codetaylor.mc.onslaught.modules.onslaught.lib.LogFormatter;

public class LoggerWrapper implements Logger {

	private static final java.util.logging.Logger fileLogger;
	private static final Logger masterLogger = LogManager.getLogger(ModOnslaught.MOD_ID);

	static {
		fileLogger = java.util.logging.Logger.getLogger(ModOnslaught.class.getName());
		try {
			FileHandler handler = new FileHandler("logs/" + ModOnslaught.MOD_ID + ".log", 1024 * 256, 5, true);
			handler.setFormatter(new LogFormatter());
			fileLogger.addHandler(handler);
			fileLogger.setUseParentHandlers(false);
			fileLogger.setLevel(java.util.logging.Level.FINE);
			fileLogger.info("Initialized logger");
		} catch (IOException e) {
			LogManager.getLogger(ModOnslaught.class.getName()).error("Error initializing Onslaught log", e);
		}

	}

	@Override
	public void catching(Level level, Throwable throwable) {
		masterLogger.catching(level, throwable);
//		fileLogger.
	}

	@Override
	public void catching(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void entry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void entry(Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R exit(R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fatal(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <MF extends MessageFactory> MF getMessageFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void info(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(Level level) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(Level level, Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFatalEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFatalEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void log(Level level, Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printf(Level level, Marker marker, String format, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printf(Level level, String format, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T extends Throwable> T throwing(Level level, T throwable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Throwable> T throwing(T throwable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trace(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public EntryMessage traceEntry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(String format, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntryMessage traceEntry(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traceExit() {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R traceExit(R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R traceExit(String format, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traceExit(EntryMessage message) {
		// TODO Auto-generated method stub

	}

	@Override
	public <R> R traceExit(EntryMessage message, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R traceExit(Message message, R result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void warn(Marker marker, Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Message message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(CharSequence message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object... params) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub

	}

}
