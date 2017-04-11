package com.wxl.prod.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.wxl.prod.common.core.Constant;

public class DateFormatUtil {

	public static final String PATTERN_DATE = "yyyy-MM-dd";

	public static final String PATTERN_HOUR = "HH:mm:ss";

	public static final String PATTERN_TO_SECOND = "yyyy-MM-dd HH:mm:ss";

	public static final String LONG_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";

	/**
	 * 把"yyyy-MM-dd HH:mm:ss"格式的字符串时间，转换成Date类型
	 * 
	 * @param timeStr
	 *            字符串时间，格式为：yyyy-MM-dd HH:mm:ss
	 * @return 转换成的时间
	 * @throws ParseException
	 *             格式错误
	 */
	public static Date parseDate(final String timeStr) throws ParseException {
		return new SimpleDateFormat(PATTERN_TO_SECOND).parse(timeStr);
	}

	/**
	 * 把Date类型的时间，转换成指定格式的字符串
	 * 
	 * @param date
	 *            需要转换的时间
	 * @return 指定格式的字符串
	 * @throws ParseException
	 */
	public static String formateDate(final Date date) throws ParseException {
		return new SimpleDateFormat(PATTERN_TO_SECOND).format(date);
	}

	/**
	 * 把Long类型的时间，转换成指定格式的字符串
	 * 
	 * @param time
	 *            1970-01-01 00:00:00到现在的毫秒数
	 * @return yyyy-MM-dd HH:mm:ss.SSS格式的时间字符串
	 * @throws ParseException
	 */
	public static String formateLongDate(final Long time) throws ParseException {
		return new SimpleDateFormat(LONG_DATE_TIME_PATTERN).format(new Date(time));
	}

	/**
	 * 添加月份到时间中
	 * 
	 * @param date
	 * @param amount
	 * @return
	 * @throws Exception
	 */
	public static Date addMonths(Date date, int amount) throws Exception {
		Calendar localCalendar = Calendar.getInstance();
		localCalendar.setTime(date);
		localCalendar.add(Calendar.MONTH, amount);
		return localCalendar.getTime();
	}

	public static Date addHours(Date date, int amount) throws Exception {
		Calendar localCalendar = Calendar.getInstance();
		localCalendar.setTime(date);
		localCalendar.add(Calendar.HOUR, amount);
		return localCalendar.getTime();
	}

	/**
	 * 把"HH:mm:ss"格式的字符串时间，转换成Date类型
	 * 
	 * @param timeStr
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDateForTime(final String timeStr) throws ParseException {
		return new SimpleDateFormat(PATTERN_DATE).parse(timeStr);
	}

	/**
	 * 获取当前时间:yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		return new SimpleDateFormat(PATTERN_TO_SECOND).format(new Date());
	}

	/**
	 * 获取当前系统时间:返回date 数据类型
	 * 
	 * @return
	 */

	public static Date getCurrentDate() {
		SimpleDateFormat format = new SimpleDateFormat(PATTERN_TO_SECOND);
		SimpleDateFormat format1 = new SimpleDateFormat(PATTERN_TO_SECOND);
		Date myDate = new Date();
		String dateString = format.format(myDate);
		try {
			return format1.parse(dateString);
		} catch (ParseException e) {
			return new Date();
		}
	}

	public static Date now() {
		return new Date();
	}

	public static String format(final Date timestamp) {
		return new SimpleDateFormat(PATTERN_TO_SECOND).format(new Date(timestamp.getTime()));
	}

	public static String format(final Date timestamp, final String pattern) {
		return new SimpleDateFormat(pattern).format(new Date(timestamp.getTime()));
	}

	public static String format2Date(final Date date) {
		return new SimpleDateFormat(PATTERN_DATE).format(date);
	}

	public static String format2Hour(final Date date) {
		return new SimpleDateFormat(PATTERN_HOUR).format(date);
	}

	public static String format2Second(final Date date) {
		if (date == null) {
			return null;
		}
		return new SimpleDateFormat(PATTERN_TO_SECOND).format(date);
	}

	public static String formatDate(final Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 截取日期保留 年月日
	 * 
	 * @param date
	 * @return
	 */
	public static Date trunc(Date date) {
		if (date != null) {
			Calendar c1 = Calendar.getInstance();
			c1.setTime(date);
			Calendar c2 = (Calendar) c1.clone();
			c1.clear();
			c1.set(Calendar.YEAR, c2.get(Calendar.YEAR));
			c1.set(Calendar.MONTH, c2.get(Calendar.MONTH));
			c1.set(Calendar.DAY_OF_MONTH, c2.get(Calendar.DAY_OF_MONTH));
			return c1.getTime();
		}
		return null;
	}

	/**
	 * 返回指定时间推后指定天数的时间点
	 * 
	 * @param date
	 * @param day
	 * @return
	 */
	public static String dateAdd(Date date, int day) {
		long time = date.getTime() + day * 24 * 60 * 60 * 1000;
		return format2Date(new Date(time));
	}

	/**
	 * 格式化时间日期格式 1、当天只显示时间 2、前一天显示昨天 3、之后本年显示月日和时间 4、不同年份显示年月日和时间
	 * 
	 * @param time
	 * @return
	 */
	public static String formatDateTime(Date time) {
		if (time == null) {
			return Constant.EMPTY_STRING;
		}
		Calendar start = Calendar.getInstance();
		start.setTime(time);
		int startDay = start.get(Calendar.DAY_OF_YEAR);
		int nowDay = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		int days = nowDay - startDay;
		String result = null;
		switch (days) {
		case 0: {
			result = format(time, "HH:mm");
			break;
		}
		case 1: {
			result = "昨天" + format(time, "HH:mm");
			break;
		}
		default: {
			result = format(time, "yyyy-MM-dd HH:mm");
			break;
		}
		}
		return result;
	}

	/**
	 * 格式化时间日期格式 1、当年只显示月日 2、非本年显示年月日
	 * 
	 * @param time
	 * @return
	 */
	public static String formatDate(Date time) {
		if (time == null) {
			return Constant.EMPTY_STRING;
		}
		String result = null;
		Calendar source = Calendar.getInstance();
		source.setTime(time);
		int source_year = source.get(Calendar.YEAR);
		if (source_year == Calendar.getInstance().get(Calendar.YEAR)) {
			result = format(time, "MM月dd日");
		} else {
			result = format(time, "yyyy年MM月dd日");
		}
		return result;
	}
}
