package com.hkjin.paymentsettlementsys.Account.dto.v2;

import java.math.BigDecimal;

public record AccountSendDtoV2(Long userId, String sendAccountNo, String sendBank, BigDecimal amount, String receiveAccountNo, String receiveBank) {
	/*
	* 보내는 사람 ID
	* 보내는 사람 은행
	* 보내는 사람 계좌번호
	* 보낼 금액
	*
	* 받는 사람 계좌번호
	* 받는 사람 은행
	*
	* */
}
