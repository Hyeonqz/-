package com.hkjin.paymentsettlementsys.log.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.log.entity.SendLog;

public interface SendLogRepository extends JpaRepository<SendLog, Long> {
}
