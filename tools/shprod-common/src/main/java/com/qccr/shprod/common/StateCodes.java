package com.qccr.shprod.common;

import com.qccr.knife.result.CommonStateCode;
import com.qccr.knife.result.StateCode;

public final class StateCodes {
	private StateCodes() {
	}

	public static final StateCode SUCCESS = CommonStateCode.SUCCESS;

	public static final StateCode NO_RELATED_DATA = CommonStateCode.NO_RELATED_DATA;

	public static final StateCode FAILED = CommonStateCode.FAILED;
	public static final StateCode DATA_EMPTY = CommonStateCode.DATA_EMPTY;
}
