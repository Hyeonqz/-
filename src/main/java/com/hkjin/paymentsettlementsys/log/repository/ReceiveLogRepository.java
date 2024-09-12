package com.hkjin.paymentsettlementsys.log.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.log.entity.ReceiveLog;

public interface ReceiveLogRepository extends JpaRepository<ReceiveLog, Long> {
}
