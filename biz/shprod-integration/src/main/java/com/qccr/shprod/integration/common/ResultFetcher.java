/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.qccr.shprod.integration.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qccr.knife.result.Result;

/**
 * 
 * @author xierongli
 * @version $Id: ResultFetcher.java, v 0.1 2016年5月4日 下午1:40:31 xierongli Exp $
 */
public abstract class ResultFetcher {
	final static Logger LOGGER = LoggerFactory.getLogger(ResultFetcher.class);

	public static <T> T fetch(Result<T> result) {
		if (result == null) {
			return null;
		}
		if (result.getStateCode() == null) {
			return null;
		}
		if (result.isSuccess()) {
			return result.getData();
		}

		if (result.getData() == null) {
			LOGGER.warn(String.format("[Fetch-AbnormalResult] stateCode=%d,stateDesc=%s,data=null",
					result.getStateCode().getCode(), result.getStateCode().getDesc()));
		} else {
			LOGGER.warn(String.format("[Fetch-AbnormalResult] stateCode=%d,stateDesc=%s,class=%s",
					result.getStateCode().getCode(), result.getStateCode().getDesc(),
					result.getData().getClass().getSimpleName()));
		}
		return result.getData();
	}
}
