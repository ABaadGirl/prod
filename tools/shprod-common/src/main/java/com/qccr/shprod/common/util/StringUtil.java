package com.qccr.shprod.common.util;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class StringUtil {
	// private final static Logger LOGGER =
	// LoggerFactory.getLogger(StringUtil.class);

	public final static char[] LowHex = "0123456789abcdef".toCharArray();

	public static boolean isEmpty(String v) {
		return v == null || v.isEmpty();
	}

	public static boolean isBlank(String v) {
		return v == null || v.trim().isEmpty();
	}

	public static boolean isNotEmpty(String v) {
		return !isEmpty(v);
	}

	public static boolean isNotBlank(String v) {
		return !isBlank(v);
	}

	public static boolean hasLength(String v, int length) {
		return isNotEmpty(v) && v.length() > length;
	}

	public static List<String> split(String v) {
		return split(v, ",");
	}

	public static List<String> split(String v, String sp) {
		if (v == null) {
			return Collections.<String> emptyList();
		}
		return Splitter.on(sp).omitEmptyStrings().trimResults().splitToList(v);
	}

	public static String join(Collection<String> v) {
		return join(v, ",");
	}

	public static String join(Collection<String> v, String sp) {
		if (v == null) {
			return "";
		}
		return Joiner.on(sp).skipNulls().join(v);
	}

	public static String substring(String v, int begin, int end) {
		if (v == null || begin > end) {
			throw new IllegalArgumentException("substring : if(v == null || begin > end)");
		}
		return v.substring(begin, end);
	}

	public static boolean isPhone(String num) {
		if (isBlank(num))
			return false;
		Pattern p = Pattern.compile("^((13[0-9])|(14[0-9])|(17[0-9])|(15[0-9])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(num);
		return m.matches();
	}

	public static boolean isPositiveNumber(String v) {
		if (isBlank(v))
			return false;
		return v.matches("[0-9]+");
	}

	public static String hidePhoneMiddle(String phone) {
		if (phone.length() > 11)
			phone = phone.substring(phone.length() - 11);
		return phone.substring(0, 3) + "****" + phone.substring(phone.length() - 4);
	}
}
