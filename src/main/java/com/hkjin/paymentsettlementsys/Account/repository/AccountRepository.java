package com.hkjin.paymentsettlementsys.Account.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.Account.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
