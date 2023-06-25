package com.ting;

public class User {
	
	String username;
	
	String password;
	
	String info;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", info=" + info + "]";
	}
	
	
	
	

}
