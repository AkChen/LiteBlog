package com.akchen.liteblog.DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		String sql = "insert into lt_user(username,password,type) values(?,?,?)";
		try {
			state = con.prepareStatement(sql);
			state.setString(1, user.getUsername());
			state.setString(2, user.getPasword());
			state.setInt(3, user.getType());
			System.out.println(state);
			int effect = state.executeUpdate();
			return effect>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Lt_Blog_Exception be = new Lt_Blog_Exception();
			be.code = Lt_Blog_Exception.REGISTER_ERROR;
			be.description = "用户名已存在;";
			throw be;
			
		}
		finally
		{
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Lt_Blog_Exception be = new Lt_Blog_Exception();
				be.code = Lt_Blog_Exception.REGISTER_ERROR;
				be.description = "未知错误;";
				throw be;
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Lt_Blog_Exception be = new Lt_Blog_Exception();
				be.code = Lt_Blog_Exception.REGISTER_ERROR;
				be.description = "未知错误;";
				throw be;
			}
		}
	}

	@Override
	public Lt_User login(Lt_User user) throws Lt_Blog_Exception {
		// TODO Auto-generated method stub
		Connection con = DBUtil.getConnection();
		PreparedStatement state = null; 
		ResultSet rs = null;
		String sql = "select type from lt_user where username=? and password = ?";
		try {
			state = con.prepareStatement(sql);
			state.setString(1, user.getUsername());
			state.setString(2, user.getPasword());
			rs = state.executeQuery();
			boolean hasRs = rs.next();
			
			if(!hasRs)
				return null;
			user.setType(rs.getInt(1));
			return user;
		} catch (SQLException e) {
			Lt_Blog_Exception be = new Lt_Blog_Exception();
			be.code = Lt_Blog_Exception.LOGIN_ERROR;
			be.description = "登录内部错误;";
			
			throw be;
		}
		finally
		{
			try {
				state.close();;
				if(rs!=null)
					rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				Lt_Blog_Exception be = new Lt_Blog_Exception();
				be.code = Lt_Blog_Exception.LOGIN_ERROR;
				be.description = "登录内部错误;";
				
				throw be;
			}
		}
	}

	@Override
	public boolean isVeifyUser(Lt_User user) throws Lt_Blog_Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
