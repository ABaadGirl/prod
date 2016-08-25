package com.qccr.shprod.common.core;

import java.nio.charset.Charset;

import com.google.common.base.Charsets;

public class Constant {
	public static final String APP_NAME = Config.getString("app_name");
	public static final String PARTNER = APP_NAME;
	public static final Charset DEFAULT_CHARSET = Charsets.UTF_8;
	public static final String DEFAULT_ENCODE = DEFAULT_CHARSET.displayName();
	public static final String DEFAULT_CONTENT_TYPE = "application/json;charset=" + DEFAULT_ENCODE;
	public static final String CHAR_COMMA = ",";
	public static final String CHAR_SEMICOLON = ";";
	public static final String CHAR_COLON = ":";
	public static final String CHAR_POINT = ".";
	public static final String CHAR_QUESTION = "?";
	public static final String CHAR_OBLIQUE = "/";
	public static final String CHAR_UNDER = "_";
	public static final String CHAR_DOLLAR = "$";

	public static final String ENV = "env";

	public static final String NULL_STRING = "null";
	public static final String EMPTY_STRING = "";
	public static final String EMPTY_JSON = "{}";

	public final static char[] HEX = "0123456789ABCDEF".toCharArray();

	public final static String SALT = "ToWell_EasyWork_EasyLife_2015";
	public static final String HTTP_PROTOCOL = "http://";
}
