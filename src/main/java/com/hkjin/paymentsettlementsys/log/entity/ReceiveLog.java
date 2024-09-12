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
public class ReceiveLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String bank;
	private BigDecimal receivedAmount;
	private String accountNo;
	@Comment("받은 후 금액")
	private BigDecimal receivedAfterAmount;
	private Long userId;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime receiveTime;

	protected ReceiveLog () {
	}

	public void addMoney(BigDecimal receivedAmount, BigDecimal receivedAfterAmount) {
		this.receivedAfterAmount = receivedAfterAmount.add(receivedAmount);
	}

}
