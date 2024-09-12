package com.hkjin.paymentsettlementsys.Account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hkjin.paymentsettlementsys.Account.dto.v1.AccountRequestDtoV1;
import com.hkjin.paymentsettlementsys.Account.dto.v1.AccountResponseV1;
import com.hkjin.paymentsettlementsys.Account.service.AccountService;

@RequestMapping("/v1/account")
@RestController
public class AccountController {
	private final AccountService accountService;

	public AccountController (AccountService accountService) {
		this.accountService = accountService;
	}

	@PostMapping("/create")
	public ResponseEntity<AccountResponseV1> createAccount(@RequestBody AccountRequestDtoV1 account) {
		AccountResponseV1 account1 = accountService.createAccount(account);
		return ResponseEntity.ok(account1);
	}
}
