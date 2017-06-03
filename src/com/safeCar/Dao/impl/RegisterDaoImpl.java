package com.safeCar.Dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.safeCar.Bean.LoginInfo;
import com.safeCar.Bean.User;
import com.safeCar.Dao.IRegisterDao;
import com.safeCar.tools.DBUtils;

public class RegisterDaoImpl implements IRegisterDao{
	private User user;
	private Connection conn;
	public RegisterDaoImpl(User user){
		this.user = user;
	}
	@Override
	public boolean insert(User user) {
		//首先获取用户的信息
		String usr_name = user.getUsr_name();
		String usr_email = user.getUsr_email();
		String usr_phone = user.getUsr_phone();
		String usr_IDcard = user.getUsr_IDcard();
		String usr_cardID = user.getUsr_carID();
		LoginInfo  in = user.getUsr_loginInfo();
		String usr_account = in.getUsr_account();
		String usr_pwd = in.getUsr_pwd();
		conn = (Connection) DBUtils.getConnection();
		String sql = "insert into user(id,usr_name,usr_email,usr_phone,usr_IDcard,usr_carID) values(null,?,?,?,?,?)";
		String sql1 = "insert into logininfo(login_info_id,usr_account,usr_pwd,flag) values(null,?,?,?)";
		try {
			PreparedStatement  pst = conn.prepareStatement(sql);
			PreparedStatement pst1 =conn.prepareStatement(sql1);
			pst.setString(1, usr_name);
			pst.setString(2, usr_email);
			pst.setString(3, usr_phone);
			pst.setString(4, usr_IDcard);
			pst.setString(5, usr_cardID);
			//默认注册是普通用户
			pst1.setString(1, usr_account);
			pst1.setString(2, usr_pwd);
			pst1.setInt(3, 0);
			int rs = pst.executeUpdate();
			int rs1 = pst1.executeUpdate();
			if(rs>0&&rs1>0){
				//表示插入成功
				System.out.println("注册成功");
				return true;
			}else{
				//插入失败
				System.out.println("注册失败");
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean query(User user) {
		conn = (Connection) DBUtils.getConnection();
		String sql = "select * from user where usr_name=?";
		try {
			PreparedStatement pst  = conn.prepareStatement(sql);
			pst.setString(1, user.getUsr_name());
			ResultSet set = pst.executeQuery();
			if(set.next()){
				//说明已经注册过了不需要再注册
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
		
}
