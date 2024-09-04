package com.demo.bankapp.response;

import java.util.List;

import com.demo.bankapp.model.User;

import lombok.Data;

@Data
public class FindAllUsersResponse {
	List<User> userList;

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
