package com.hkjin.paymentsettlementsys.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.hkjin.paymentsettlementsys.user.entity.User;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {
}
