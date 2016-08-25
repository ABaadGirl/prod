package com.qccr.shprod.biz.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qccr.knife.result.CommonStateCode;
import com.qccr.knife.result.Result;
import com.qccr.knife.result.Results;
import com.qccr.shprod.model.expection.ShprodException;

/**
 * 对外的服务实现基类
 *
 * @author xuhaifeng@qccr.com
 * @since Revision:1.0.0, Date: 2016年3月21日 上午11:05:20
 */
public abstract class BaseServiceFacadeImpl {

	protected Logger logger = LoggerFactory.getLogger(BaseServiceFacadeImpl.class);

	public BaseServiceFacadeImpl() {
		logger = LoggerFactory.getLogger(this.getClass());
	}

	protected Result<?> processServiceException(String msg, Throwable t) {
		logger.error(msg + ", msg:" + t.getMessage(), t);

		if (t instanceof ShprodException) {
			return Results.newFailedResult(((ShprodException) t).getStateCode(), t.getMessage());
		} else {
			return Results.newFailedResult(CommonStateCode.FAILED, "system error, release retry");
		}
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
