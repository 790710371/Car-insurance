package com.safeCar.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.safeCar.Bean.LoginInfo;
import com.safeCar.Dao.ILoginDao;
import com.safeCar.tools.DBUtils;

public class LoginDaoImpl implements ILoginDao{
	LoginInfo info;
	int flag;
	public LoginDaoImpl(LoginInfo info){
		this.info = info;
	}
	@Override
	public boolean query(LoginInfo info,HttpServletRequest requests) {
		String usr_account = info.getUsr_account();
		String usr_pwd = info.getUsr_pwd();
		Connection conn  = DBUtils.getConnection();
		String sql = "select * from logininfo where usr_account=? and usr_pwd=?";
			PreparedStatement pst;
			try {
				pst = conn.prepareStatement(sql);
				pst.setString(1, usr_account);
				pst.setString(2, usr_pwd);
				System.out.println("usr_account:"+usr_account+"usr_pwd:"+usr_pwd);
				ResultSet set = pst.executeQuery();
				if(set.next()){
					System.out.println(set);
					System.out.println("登陆成功");
				flag = set.getInt(4);
				System.out.println("flag:"+flag);
					return true;
				}else{
					//登陆失败
					System.out.println("登录失败");
					return false;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
		
		}

	@Override
	public boolean verifyIdentity() {
		System.out.println("flag:"+flag);
		if(flag==0){
			System.out.println("普通用户登录成功");
			return false;
		}else if(flag==1){
			System.out.println("管理员登录成功");
			return true;
		}
		return false;
	}
}
