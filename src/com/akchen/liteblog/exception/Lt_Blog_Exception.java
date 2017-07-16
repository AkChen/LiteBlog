package com.akchen.liteblog.exception;

public class Lt_Blog_Exception extends Exception{
	public static final int REGISTER_ERROR = 1;
	public static final int LOGIN_ERROR = 2;
	public int code ;
	public String description;
}
