package com.demo.bankapp.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Transfer {

	private @Id @GeneratedValue Long id;
	private Long fromUserId;
	private Long toUserId;
	private String currency;
	private BigDecimal amount;
	private Date transferTime;

	private Transfer() {
	}

	public Transfer(Long fromUserId, Long toUserId, String currency, BigDecimal amount) {
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
		this.currency = currency;
		this.amount = amount;
		this.transferTime = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(Long fromUserId) {
		this.fromUserId = fromUserId;
	}

	public Long getToUserId() {
		return toUserId;
	}

	public void setToUserId(Long toUserId) {
		this.toUserId = toUserId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}
	
}
