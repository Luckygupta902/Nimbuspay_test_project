package com.demo.bankapp.response;

import com.demo.bankapp.model.Transfer;

import lombok.Data;

@Data
public class CreateTransferResponse {
	private Transfer transfer;

	public Transfer getTransfer() {
		return transfer;
	}

	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}
	
}
