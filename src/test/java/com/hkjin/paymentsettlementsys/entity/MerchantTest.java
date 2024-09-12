package com.hkjin.paymentsettlementsys.entity;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hkjin.paymentsettlementsys.merchant.entity.Merchant;
import com.hkjin.paymentsettlementsys.merchant.repository.MerchantRepository;

@SpringBootTest
class MerchantTest {
	@Autowired
	private MerchantRepository merchantRepository;

	@BeforeEach
	public void setUp () {
		System.out.println("Merchant Test setup");
	}

	@Test
	@DisplayName("가맹점 생성 테스트")
	void merchant_create () {
		// given
		UUID uuid = UUID.randomUUID();
		Merchant merchant = new Merchant(uuid.toString(), "메가커피", "010-1234-5678", "경기도 수원시 영통구", "100-123-456");

		// when
		merchantRepository.save(merchant);

		// then
		Assertions.assertNotNull(merchant.getId());
	}

}