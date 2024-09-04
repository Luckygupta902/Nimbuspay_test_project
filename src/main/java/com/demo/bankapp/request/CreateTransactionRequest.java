package com.demo.bankapp.request;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CreateTransactionRequest extends BaseRequest {

	private String username;
	private boolean isBuying;
	private String currency;
	private BigDecimal amount;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isBuying() {
		return isBuying;
	}
	public void setBuying(boolean isBuying) {
		this.isBuying = isBuying;
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
	
	
}
