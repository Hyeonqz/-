package com.hkjin.paymentsettlementsys.settlement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.settlement.entity.Settlement;

public interface SettlementRepository extends JpaRepository<Settlement, Long> {
}
