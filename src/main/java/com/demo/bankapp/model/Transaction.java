package com.demo.bankapp.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Transaction {

	private @Id @GeneratedValue Long id;
	private Long userId;
	private boolean isBought;
	private String currency;
	private BigDecimal amount;
	private Date transactionTime;

	private Transaction() {
	}

	public Transaction(Long userId, boolean isBought, String currency, BigDecimal amount) {
		this.userId = userId;
		this.isBought = isBought;
		this.currency = currency;
		this.amount = amount;
		this.transactionTime = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean isBought() {
		return isBought;
	}

	public void setBought(boolean isBought) {
		this.isBought = isBought;
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

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}
	

}
