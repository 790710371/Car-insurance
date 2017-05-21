package com.safeCar.Dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.safeCar.Bean.User;
import com.safeCar.Dao.IAdminQuery;
import com.safeCar.tools.DBUtils;

public class AdminQueryImpl implements IAdminQuery{
	 public AdminQueryImpl() {
		 	
		}
	@Override
	public User queryUserInfo(String usr_name) {
		Connection conn = (Connection) DBUtils.getConnection();
		String sql = "select * from user where usr_name=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(2, usr_name);
			ResultSet set = pst.executeQuery();
			while(set.next()){
//				String usr_account =set.getString(columnIndex)
//				String usr_email = set.getString(3);//获取用户邮箱
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
