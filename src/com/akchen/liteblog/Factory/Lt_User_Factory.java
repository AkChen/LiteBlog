package com.akchen.liteblog.Factory;

import com.akchen.liteblog.VO.Lt_User;

public class Lt_User_Factory {
	public static Lt_User createUser()
	{
		return new Lt_User();
	}
}
