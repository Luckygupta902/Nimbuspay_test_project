package com.demo.bankapp.request;

import java.math.BigDecimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CreateTransferRequest extends BaseRequest {

	private String senderUsername;
	private String receiverTcno;
	private String currency;
	private BigDecimal amount;
	public String getSenderUsername() {
		return senderUsername;
	}
	public void setSenderUsername(String senderUsername) {
		this.senderUsername = senderUsername;
	}
	public String getReceiverTcno() {
		return receiverTcno;
	}
	public void setReceiverTcno(String receiverTcno) {
		this.receiverTcno = receiverTcno;
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
