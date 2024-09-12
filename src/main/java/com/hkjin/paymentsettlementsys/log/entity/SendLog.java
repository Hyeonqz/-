package com.hkjin.paymentsettlementsys.log.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class SendLog {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private BigDecimal amountToSend;
	private String bank;
	private String accountNo;
	@Comment("보낸 후 금액")
	private BigDecimal amountAfterSend;
	private Long userId;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime sendTime;

	protected SendLog () {
	}

	public void minusAmountToSend(BigDecimal amountToSend, BigDecimal amountAfterSend) {
		this.amountAfterSend = amountAfterSend.subtract(amountAfterSend);
	}



}
