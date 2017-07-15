package com.akchen.liteblog.Factory;

import com.akchen.liteblog.DAO.Lt_User_DAO;
import com.akchen.liteblog.DAOImpl.Lt_User_DAO_Impl;

public class Lt_DAO_Factory {
	private static Lt_User_DAO user_DAO = null;
	public static Lt_User_DAO createUserDAO()
	{
		if(user_DAO == null)
			user_DAO = new Lt_User_DAO_Impl();
		return user_DAO;
	}

}
