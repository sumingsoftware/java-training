package com.chinasofti.page23;

public class UserInfo {
    private int id;
    
    private String username;
    
    private String passWord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserInfo(int id, String username, String passWord) {
		super();
		this.id = id;
		this.username = username;
		this.passWord = passWord;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", username=" + username + ", passWord=" + passWord + "]";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserInfo(String username, String passWord) {
		super();
		this.username = username;
		this.passWord = passWord;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
