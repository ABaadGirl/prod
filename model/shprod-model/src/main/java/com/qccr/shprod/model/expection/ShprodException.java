package com.qccr.shprod.model.expection;

import com.qccr.knife.result.StateCode;

public class ShprodException extends Exception {

	private static final long serialVersionUID = -7047088783151840923L;

	private StateCode stateCode;

	/**
	 * @param illegalParameter
	 * @param msg
	 * @param e
	 */
	public ShprodException(StateCode stateCode, String msg, Exception e) {
		super(msg, e);
		this.stateCode = stateCode;
	}

	public ShprodException(StateCode stateCode, String msg) {
		this(stateCode, msg, null);
	}

	public StateCode getStateCode() {
		return this.stateCode;
	}

}
