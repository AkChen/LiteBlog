package com.akchen.liteblog.DAO;

import com.akchen.liteblog.VO.Lt_User;
import com.akchen.liteblog.exception.Lt_Blog_Exception;

public interface Lt_User_DAO {
	public boolean register(Lt_User user) throws Lt_Blog_Exception;
	public Lt_User login(Lt_User user) throws Lt_Blog_Exception;
}
