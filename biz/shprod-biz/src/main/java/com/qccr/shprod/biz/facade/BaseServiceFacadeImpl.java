package com.qccr.shprod.biz.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 对外的服务实现基类
 */
public abstract class BaseServiceFacadeImpl {

	protected Logger logger = LoggerFactory.getLogger(BaseServiceFacadeImpl.class);

	public BaseServiceFacadeImpl() {
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
