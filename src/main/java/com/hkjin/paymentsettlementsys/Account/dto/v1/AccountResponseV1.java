package com.hkjin.paymentsettlementsys.Account.dto.v1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.hkjin.paymentsettlementsys.common.enums.Bank;

public record AccountResponseV1(String accountNo, BigDecimal amount, Bank bank, Long userId, LocalDateTime createAt) {
}
