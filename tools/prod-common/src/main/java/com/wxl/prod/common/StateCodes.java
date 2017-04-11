package com.wxl.prod.common;

public enum StateCodes {

	SUCCESS(0, "SUCCESS"), NO_RELATED_DATA(1, "NO_RELATED_DATA"), FAILED(-1, "FAILED"), DATA_EMPTY(2, "DATA_EMPTY");

	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private StateCodes(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private StateCodes() {
	}


}
