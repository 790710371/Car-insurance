package com.safeCar.Dao;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;

import com.safeCar.Bean.LoginInfo;

public interface ILoginDao {
	//用户登录查询是否账号密码正确，返回查询结果true代表查询成功，false代表失败
	public boolean query(LoginInfo info,HttpServletRequest requests);
	//验证身份，返回true代表是管理员，返回false代表不是管理员
	public boolean verifyIdentity();
}
