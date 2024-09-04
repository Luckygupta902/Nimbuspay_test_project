package com.demo.bankapp.response;

import java.util.List;

import com.demo.bankapp.model.Transaction;

import lombok.Data;

@Data
public class FindAllTransactionsByUserResponse {
	private List<Transaction> transactionList;

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
}
