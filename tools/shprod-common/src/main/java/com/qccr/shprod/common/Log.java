package com.qccr.shprod.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class Log {

	private static final Logger log = LoggerFactory.getLogger(Log.class);

	public static void debug(final String msg) {
		log.debug(msg);
	}

	public static void debug(final String msg, final Throwable e) {
		log.debug(msg, e);
	}

	public static void info(final String msg) {
		log.info(msg);
	}

	public static void info(final String msg, final Throwable e) {
		log.info(msg, e);
	}

	public static void warn(final String msg) {
		log.warn(msg);
	}

	public static void warn(final String msg, final Throwable e) {
		log.warn(msg, e);
	}

	public static void error(final String msg) {
		log.error(msg);
	}

	public static void error(final String msg, final Throwable e) {
		log.error(msg, e);
	}

	// =============================================================================

	public static void debug(final String format, final Object arg) {
		log.debug(format, arg);
	}

	public static void debug(final String format, final Object... arguments) {
		log.debug(format, arguments);
	}

	public static void debug(final Marker marker, final String msg) {
		log.debug(marker, msg);
	}

	public static void debug(final String format, final Object arg1, final Object arg2) {
		log.debug(format, arg1, arg2);
	}

	public static void debug(final Marker marker, final String format, final Object arg) {
		log.debug(marker, format, arg);
	}

	public static void debug(final Marker marker, final String format, final Object... arguments) {
		log.debug(marker, format, arguments);
	}

	public static void debug(final Marker marker, final String msg, final Throwable t) {
		log.debug(marker, msg, t);

	}

	public static void debug(final Marker marker, final String format, final Object arg1, final Object arg2) {
		log.debug(marker, format, arg1, arg2);
	}

	public static void error(final String format, final Object arg) {
		log.error(format, arg);
	}

	public static void error(final String format, final Object... arguments) {
		log.error(format, arguments);
	}

	public static void error(final Marker marker, final String msg) {
		log.error(marker, msg);
	}

	public static void error(final String format, final Object arg1, final Object arg2) {
		log.error(format, arg1, arg2);
	}

	public static void error(final Marker marker, final String format, final Object arg) {
		log.error(marker, format, arg);
	}

	public static void error(final Marker marker, final String format, final Object... arguments) {
		log.error(marker, format, arguments);
	}

	public static void error(final Marker marker, final String msg, final Throwable t) {
		log.error(marker, msg, t);

	}

	public static void error(final Marker marker, final String format, final Object arg1, final Object arg2) {
		log.error(marker, format, arg1, arg2);
	}

	public static String getName() {
		return log.getName();
	}

	public static void info(final String format, final Object arg) {
		log.info(format, arg);
	}

	public static void info(final String format, final Object... arguments) {
		log.info(format, arguments);
	}

	public static void info(final Marker marker, final String msg) {
		log.info(marker, msg);
	}

	public static void info(final String format, final Object arg1, final Object arg2) {
		log.info(format, arg1, arg2);
	}

	public static void info(final Marker marker, final String format, final Object arg) {
		log.info(marker, format, arg);
	}

	public static void info(final Marker marker, final String format, final Object... arguments) {
		log.info(marker, format, arguments);
	}

	public static void info(final Marker marker, final String msg, final Throwable t) {
		log.info(marker, msg, t);

	}

	public static void info(final Marker marker, final String format, final Object arg1, final Object arg2) {
		log.info(marker, format, arg1, arg2);
	}

	public static void trace(String msg) {
		log.trace(msg);
	}

	public static void trace(String msg, Throwable t) {
		log.trace(msg, t);
	}

	public static void trace(final String format, final Object arg) {
		log.trace(format, arg);
	}

	public static void trace(final String format, final Object... arguments) {
		log.trace(format, arguments);
	}

	public static void trace(final Marker marker, final String msg) {
		log.trace(marker, msg);
	}

	public static void trace(final String format, final Object arg1, final Object arg2) {
		log.trace(format, arg1, arg2);
	}

	public static void trace(final Marker marker, final String format, final Object arg) {
		log.trace(marker, format, arg);
	}

	public static void trace(final Marker marker, final String format, final Object... arguments) {
		log.trace(marker, format, arguments);
	}

	public static void trace(final Marker marker, final String msg, final Throwable t) {
		log.trace(marker, msg, t);

	}

	public static void trace(final Marker marker, final String format, final Object arg1, final Object arg2) {
		log.trace(marker, format, arg1, arg2);
	}

	public static void warn(final String format, final Object arg) {
		log.warn(format, arg);
	}

	public static void warn(final String format, final Object... arguments) {
		log.warn(format, arguments);
	}

	public static void warn(final Marker marker, final String msg) {
		log.warn(marker, msg);
	}

	public static void warn(final String format, final Object arg1, final Object arg2) {
		log.warn(format, arg1, arg2);
	}

	public static void warn(final Marker marker, final String format, final Object arg) {
		log.warn(marker, format, arg);
	}

	public static void warn(final Marker marker, final String format, final Object... arguments) {
		log.warn(marker, format, arguments);
	}

	public static void warn(final Marker marker, final String msg, final Throwable t) {
		log.warn(marker, msg, t);

	}

	public static void warn(final Marker marker, final String format, final Object arg1, final Object arg2) {
		log.warn(marker, format, arg1, arg2);
	}

	/*
	 * public boolean isDebugEnabled() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * public boolean isDebugEnabled(Marker marker) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * public boolean isErrorEnabled() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * public boolean isErrorEnabled(Marker marker) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * public boolean isInfoEnabled() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * public boolean isInfoEnabled(Marker marker) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * public boolean isTraceEnabled() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * public boolean isTraceEnabled(Marker marker) { // TODO Auto-generated
	 * method stub return false; }
	 * 
	 * 
	 * public boolean isWarnEnabled() { // TODO Auto-generated method stub
	 * return false; }
	 * 
	 * 
	 * public boolean isWarnEnabled(Marker marker) { // TODO Auto-generated
	 * method stub return false; }
	 */
}
