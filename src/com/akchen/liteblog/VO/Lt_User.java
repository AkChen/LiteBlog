package com.akchen.liteblog.VO;

public class Lt_User {
	public final static int USER_ADMIN = 1;
	public final static int USER_NOMAL = 2;
	
	private String username;
	private String pasword;
	private int type;
	public Lt_User(String username, String pasword, int type) {
		super();
		this.username = username;
		this.pasword = pasword;
		this.type = type;
	}
	public Lt_User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
