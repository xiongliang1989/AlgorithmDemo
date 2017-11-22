package com.xl.set.entity;

public class User {

	private String username;
	private String password;

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof User) {
			User newUser = (User) obj;
			return this.username.equals(newUser.getUsername()) && this.password.equals(newUser.getPassword());
		} else {
			return super.equals(obj);
		}
	}

	@Override
	public int hashCode() {
		return username.hashCode()*password.hashCode();
	}

}
