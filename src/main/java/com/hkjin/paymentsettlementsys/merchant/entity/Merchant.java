package com.hkjin.paymentsettlementsys.merchant.entity;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Merchant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Comment("가맹점 식별 코드")
	private String uuid;
	private String merchantName;
	private String phoneNumber;
	private String location;
	private String businessNo;

	public Merchant (String uuid, String merchantName, String phoneNumber, String location, String businessNo) {
		this.uuid = uuid;
		this.merchantName = merchantName;
		this.phoneNumber = phoneNumber;
		this.location = location;
		this.businessNo = businessNo;
	}

	public Merchant () {
	}

	public Long getId () {
		return id;
	}

	public String getUuid () {
		return uuid;
	}

	public String getMerchantName () {
		return merchantName;
	}

	public String getPhoneNumber () {
		return phoneNumber;
	}

	public String getLocation () {
		return location;
	}

	public String getBusinessNo () {
		return businessNo;
	}

}