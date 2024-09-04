package com.demo.bankapp.response;

import com.demo.bankapp.model.Wealth;

import lombok.Data;

@Data
public class RetrieveWealthResponse {
	private Wealth wealth;

	public Wealth getWealth() {
		return wealth;
	}

	public void setWealth(Wealth wealth) {
		this.wealth = wealth;
	}
	
}
