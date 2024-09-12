package com.hkjin.paymentsettlementsys.Account.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hkjin.paymentsettlementsys.Account.dto.v1.AccountRequestDtoV1;
import com.hkjin.paymentsettlementsys.Account.dto.v1.AccountResponseV1;
import com.hkjin.paymentsettlementsys.Account.dto.v2.AccountSendDtoV2;
import com.hkjin.paymentsettlementsys.Account.entity.Account;
import com.hkjin.paymentsettlementsys.Account.repository.AccountRepository;
import com.hkjin.paymentsettlementsys.common.exception.UserNotFoundException;
import com.hkjin.paymentsettlementsys.user.entity.User;
import com.hkjin.paymentsettlementsys.user.repository.UserRepository;

@Transactional(readOnly = true)
@Service
public class AccountService {
	private final AccountRepository accountRepository;
	private final UserRepository userRepository;

	public AccountService (AccountRepository accountRepository, UserRepository userRepository) {
		this.accountRepository = accountRepository;
		this.userRepository = userRepository;
	}

	@Transactional
	public AccountResponseV1 createAccount(AccountRequestDtoV1 accountDtoV1) {
		User user = userRepository.findById(accountDtoV1.userId())
			.orElseThrow(() -> new IllegalArgumentException("User not found"));

		Account account = new Account();
		account.createAccount(accountDtoV1.accountNo(),accountDtoV1.bank(), accountDtoV1.amount(),user);

		accountRepository.save(account);

		return new AccountResponseV1(
			account.getAccountNo(),
			account.getAmount(),
			account.getBank(),
			account.getUser().getId(),
			account.getCreatedTime()
		);
	}

	@Transactional
	public void sendMoney(AccountSendDtoV2 accountSendDtoV2) {
		// 돈을 보낼 User 엔티티를 조회한다.
		User sendUser = userRepository.findById(accountSendDtoV2.userId())
			.orElseThrow(() -> new UserNotFoundException("User not found"));

		// User 엔티티 에서 id 에 따라서 본인의 어느 계좌에서 얼마를 송금할지를 결정해야 한다.

		// User 객체를 받아온다
		// User 엔티티 변화는 없다.

		// 입력받은 계좌번호가 있는지 조회를 한다.
		// 계좌번호에 해당하는 User 를 찾는다.

		// 1) User Id 1인 사람이 userId 가 2인 사람한테 송금을 한다
		// 2) sendLog, receiveLog 에 송금 및 수신 기록을 한다.

		// 돈을 보내기 위해서는 상대방의 은행 및 계좌번호를 알아야 한다.
		// 은행, 계좌번호, 금액 에 해당하는 dto 가 필요할듯.

	}

}
