package com.akchen.liteblog.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.akchen.liteblog.DAO.*;
import com.akchen.liteblog.VO.Lt_User;
import com.akchen.liteblog.exception.Lt_Blog_Exception;
import com.akchen.liteblog.utils.DBUtil;
public class Lt_User_DAO_Impl implements Lt_User_DAO {

	@Override
	public boolean register(Lt_User user) throws Lt_Blog_Exception{
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		PreparedStatement state = null; 
		String sql = "insert into lt_user(username,pasword,type) values(?,?,?)";
		try {
			state = con.prepareStatement(sql);
			state.setString(1, user.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Lt_Blog_Exception be = new Lt_Blog_Exception();
			be.code = Lt_Blog_Exception.REGISTER_ERROR;
			be.description = "Error when insert info;";
			
		}
		finally
		{
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Lt_Blog_Exception be = new Lt_Blog_Exception();
				be.code = Lt_Blog_Exception.REGISTER_ERROR;
				be.description = "Error when close date;";
				throw be;
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Lt_Blog_Exception be = new Lt_Blog_Exception();
				be.code = Lt_Blog_Exception.REGISTER_ERROR;
				be.description = "Error when close connection;";
				throw be;
			}
		}
		return false;
	}

}
