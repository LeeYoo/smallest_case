package com.leyo.springboot.web.result;

/**
 * 【接口调用响应码】
 */

public enum ErrorCode {

	SUCCESS(0, "成功"), FAIL(1, "失败"),

	;

	int code;
	String msg;
	ErrorCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public int code() {
		return code;
	}
	public String msg() {
		return msg;
	}
}
