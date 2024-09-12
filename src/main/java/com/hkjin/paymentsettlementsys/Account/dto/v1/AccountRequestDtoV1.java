package com.hkjin.paymentsettlementsys.Account.dto.v1;

import java.math.BigDecimal;

import com.hkjin.paymentsettlementsys.common.enums.Bank;

public record AccountRequestDtoV1(String accountNo, BigDecimal amount, Bank bank, Long userId) {
}
