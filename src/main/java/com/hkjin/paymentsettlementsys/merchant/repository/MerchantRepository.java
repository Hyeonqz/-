package com.hkjin.paymentsettlementsys.merchant.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hkjin.paymentsettlementsys.merchant.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
