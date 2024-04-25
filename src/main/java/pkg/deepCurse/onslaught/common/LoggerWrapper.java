package pkg.deepCurse.onslaught.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;

import net.minecraftforge.fml.relauncher.FMLLaunchHandler;

public class LoggerWrapper {
	private Logger logger;
	private String name;

	public LoggerWrapper(Class<?> clazz, String name) {
		this.logger = LogManager.getLogger(clazz);
		this.name = FMLLaunchHandler.isDeobfuscatedEnvironment() ? String.format("%s:%s", clazz.getName(), name) : name;
	}

	public LoggerWrapper(Class<?> clazz) {
		this.logger = LogManager.getLogger(clazz);
		this.name = FMLLaunchHandler.isDeobfuscatedEnvironment() ? clazz.getName() : clazz.getSimpleName();
	}

	private String mix(String name, String message) {
		return String.format("[%s] %s", name, message);
	}
	
	public void debug(String message) {
		logger.debug(mix(name, message));
	}

	public void debug(String message, Object obj) {
		logger.debug(mix(name, message), obj);

	}

	public void debug(String message, Object... objs) {
		logger.debug(mix(name, message), objs);
	}

	public void debug(String message, Throwable throwable) {
		logger.debug(mix(name, message), throwable);
	}

	public void debug(Marker marker, String message) {
		logger.debug(marker, mix(name, message));
	}

	public void debug(String message, Object obj1, Object obj2) {
		logger.debug(mix(name, message), obj1, obj2);
	}

	public void debug(Marker marker, String message, Object obj1) {
		logger.debug(marker, mix(name, message), obj1);
	}

	public void debug(Marker marker, String message, Object... objs) {
		logger.debug(marker, mix(name, message), objs);
	}

	public void debug(Marker marker, String message, Throwable throwable) {
		logger.debug(marker, mix(name, message), throwable);
	}

	public void debug(Marker marker, String message, Object obj1, Object obj2) {
		logger.debug(marker, mix(name, message), obj1, obj2);
	}

	public void error(String message) {
		logger.error(mix(name, message));
	}

	public void error(String message, Object obj1) {
		logger.error(mix(name, message), obj1);
	}

	public void error(String message, Object... objs) {
		logger.error(mix(name, message), objs);
	}

	public void error(String message, Throwable throwable) {
		logger.error(mix(name, message), throwable);
	}

	public void error(Marker marker, String message) {
		logger.error(marker, mix(name, message));
	}

	public void error(String message, Object obj1, Object obj2) {
		logger.error(mix(name, message), obj1, obj2);
	}

	public void error(Marker marker, String message, Object obj1) {
		logger.error(marker, mix(name, message), obj1);
	}

	public void error(Marker marker, String message, Object... objs) {
		logger.error(marker, mix(name, message), objs);
	}

	public void error(Marker marker, String message, Throwable throwable) {
		logger.error(marker, mix(name, message), throwable);
	}

	public void error(Marker marker, String message, Object obj1, Object obj2) {
		logger.error(marker, mix(name, message), obj1, obj2);
	}

	public String getId() {
		return this.name;
	}

	// TODO figure this one out
	public String getName() {
		return logger.getName();
//		return id;
	}

	public void info(String message) {
		logger.info(mix(name, message));
	}

	public void info(String message, Object obj1) {
		logger.info(mix(name, message), obj1);
	}

	public void info(String message, Object... objs) {
		logger.info(mix(name, message), objs);
	}

	public void info(String message, Throwable throwable) {
		logger.info(mix(name, message), throwable);
	}

	public void info(Marker marker, String message) {
		logger.info(marker, mix(name, message));
	}

	public void info(String message, Object obj1, Object obj2) {
		logger.info(mix(name, message), obj1, obj2);
	}

	public void info(Marker marker, String message, Object obj1) {
		logger.info(marker, mix(name, message), obj1);
	}

	public void info(Marker marker, String message, Object... objs) {
		logger.info(marker, mix(name, message), objs);
	}

	public void info(Marker marker, String message, Throwable throwable) {
		logger.info(marker, mix(name, message), throwable);
	}

	public void info(Marker marker, String message, Object obj2, Object obj3) {
		logger.info(mix(name, message));
	}

	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public boolean isDebugEnabled(Marker marker) {
		return logger.isDebugEnabled(marker);
	}

	public boolean isErrorEnabled() {
		return logger.isErrorEnabled();
	}

	public boolean isErrorEnabled(Marker marker) {
		return logger.isErrorEnabled(marker);
	}

	public boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}

	public boolean isInfoEnabled(Marker marker) {
		return logger.isInfoEnabled(marker);
	}

	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public boolean isTraceEnabled(Marker marker) {
		return isTraceEnabled(marker);
	}

	public boolean isWarnEnabled() {
		return isWarnEnabled();
	}

	public boolean isWarnEnabled(Marker marker) {
		return isWarnEnabled(marker);
	}

	public void trace(String message) {
		logger.trace(mix(name, message));
	}

	public void trace(String message, Object obj1) {
		logger.trace(mix(name, message), obj1);
	}

	public void trace(String message, Object... objs) {
		logger.trace(mix(name, message), objs);
	}

	public void trace(String message, Throwable throwable) {
		logger.trace(mix(name, message), throwable);
	}

	public void trace(Marker marker, String message) {
		logger.trace(marker, mix(name, message));
	}

	public void trace(String message, Object obj1, Object obj2) {
		logger.trace(mix(name, message), obj1, obj2);
	}

	public void trace(Marker marker, String message, Object obj1) {
		logger.trace(marker, mix(name, message), obj1);
	}

	public void trace(Marker marker, String message, Object... objs) {
		logger.trace(mix(name, message), objs);
	}

	public void trace(Marker marker, String message, Throwable throwable) {
		logger.trace(mix(name, message), throwable);
	}

	public void trace(Marker marker, String message, Object obj1, Object obj2) {
		logger.trace(mix(name, message), obj1, obj2);
	}

	public void warn(String message) {
		logger.warn(mix(name, message));
	}

	public void warn(String message, Object obj1) {
		logger.warn(mix(name, message), obj1);
	}

	public void warn(String message, Object... objs) {
		logger.warn(mix(name, message), objs);
	}

	public void warn(String message, Throwable throwable) {
		logger.warn(mix(name, message), throwable);
	}

	public void warn(Marker marker, String message) {
		logger.warn(marker, mix(name, message));
	}

	public void warn(String message, Object obj1, Object obj2) {
		logger.warn(mix(name, message), obj1, obj2);
	}

	public void warn(Marker marker, String message, Object obj1) {
		logger.warn(marker, mix(name, message), obj1);
	}

	public void warn(Marker marker, String message, Object... objs) {
		logger.warn(marker, mix(name, message), objs);
	}

	public void warn(Marker marker, String message, Throwable throwable) {
		logger.warn(marker, mix(name, message), throwable);
	}

	public void warn(Marker marker, String message, Object obj1, Object obj2) {
		logger.warn(marker, mix(name, message), obj1, obj2);
	}

}
