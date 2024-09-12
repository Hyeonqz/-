package com.hkjin.paymentsettlementsys.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
