package com.api.requestbodystruct;

public class error {
	private static String code;
	private static String message;

	public static String getCode() {
		return code;
	}

	public static void setCode(String code) {
		error.code = code;
	}

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		error.message = message;
	}

}
