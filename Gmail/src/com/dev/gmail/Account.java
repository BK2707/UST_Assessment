package com.dev.gmail;

public class Account {
	private int user_id;
	private String user_name;
	private int password;
	private String email;
	public int getUser_id() {
		return user_id;
	}
	public void  setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Account [user_id=" + user_id + ", user_name=" + user_name + ", email=" + email + "]";
	}
	
}
