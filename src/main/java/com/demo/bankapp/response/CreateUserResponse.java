package com.demo.bankapp.response;

import lombok.Data;

@Data
public class CreateUserResponse {
	private String username;
	private String tcno;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTcno() {
		return tcno;
	}
	public void setTcno(String tcno) {
		this.tcno = tcno;
	}
	
}
