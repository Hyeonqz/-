package com.hkjin.paymentsettlementsys.Account.repository;

import java.util.List;

import com.hkjin.paymentsettlementsys.Account.entity.Account;

public interface AccountRepositoryCustom {
	List<Account> findMemberCustom();

}
