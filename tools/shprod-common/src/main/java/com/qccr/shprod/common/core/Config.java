package com.qccr.shprod.common.core;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import com.google.common.collect.ImmutableMap;
import com.qccr.shprod.common.util.CollectionUtil;
import com.qccr.shprod.common.util.StringUtil;

public class Config {
	private Config() {
	}

	private static AtomicBoolean INITED = new AtomicBoolean(false);
	private static Map<String, String> properties;

	public static String getString(String key) {
		if (properties == null) {
			return null;
		}
		return properties.get(key);
	}

	public static String getString(String key, String defaultValue) {
		String v = getString(key);
		if (StringUtil.isBlank(v)) {
			return defaultValue;
		}
		return v;
	}

	public static int getInt(String key) {
		return Integer.parseInt(getString(key));
	}

	public static int getInt(String key, int defaultValue) {
		String v = getString(key);
		if (StringUtil.isBlank(v)) {
			return defaultValue;
		}
		return Integer.parseInt(v);
	}

	public static boolean getBoolean(String key) {
		return Boolean.parseBoolean(getString(key));
	}

	public synchronized static void initialize(Map<String, String> properties) {
		if (CollectionUtil.isEmpty(properties)) {
			return;
		}
		if (INITED.compareAndSet(false, true)) {
			Config.properties = ImmutableMap.copyOf(properties);
			INITED.set(true);
		}
	}
}
