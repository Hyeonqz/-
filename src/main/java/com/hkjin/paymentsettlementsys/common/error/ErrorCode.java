package com.hkjin.paymentsettlementsys.common.error;

public enum ErrorCode {
	USER_NOT_FOUND("사용자가 존재하지 않습니다."),
	ACCOUNT_NOT_EXIST("해당 계좌가 존재하지 않습니다."),
	USER_ACCOUNT_NOT_MATCH("사용자 와 계좌 소유자가 일치하지 않습니다."),
	ACCOUNT_INVALID("유효하지 않은 계좌 입니다. 계좌번호를 확인해주세요");


	private String description;

	public String getDescription () {
		return description;
	}

	ErrorCode (String description) {
		this.description = description;
	}
}
