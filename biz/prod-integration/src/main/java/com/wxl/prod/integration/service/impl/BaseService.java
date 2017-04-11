package com.wxl.prod.integration.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService {
	protected Logger logger = LoggerFactory.getLogger(BaseService.class);

	public BaseService() {
		logger = LoggerFactory.getLogger(this.getClass());
	}

	protected void logBizMessage(String name, Object... params) {
		if (logger.isInfoEnabled())
			logger.info(toLogMessage(name, params));
	}

	protected void logDebugMessage(String name, Object... params) {
		if (logger.isDebugEnabled())
			logger.debug(toLogMessage(name, params));
	}

	private String toLogMessage(String name, Object... params) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name).append("::");
		for (int i = 0; i < params.length; i++) {
			stringBuilder.append(params[i]).append("|");
		}
		return stringBuilder.toString();
	}
}
