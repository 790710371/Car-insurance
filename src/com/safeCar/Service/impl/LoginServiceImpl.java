package com.safeCar.Service.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.safeCar.Bean.LoginInfo;
import com.safeCar.Dao.impl.LoginDaoImpl;
import com.safeCar.Service.ILoginService;

public class LoginServiceImpl implements ILoginService{
	LoginInfo info;
	HttpServletRequest request;
	public LoginServiceImpl(LoginInfo info,HttpServletRequest request){
		this.info = info;
		this.request = request;
	}
	@Override
	public void login(LoginListener listener) {
			LoginDaoImpl loginDao = new LoginDaoImpl(info);
			boolean isLoginedflag = loginDao.query(info, request);
			System.out.println(String.valueOf(isLoginedflag));
			if(isLoginedflag){
				//��¼�ɹ��󣬰�session��������
				System.out.println(isLoginedflag);
				HttpSession session = request.getSession();
				session.setAttribute("userinfo", info);
				System.out.println(session.getAttribute("userinfo"));
				System.out.println("��¼֮���"+session);
				if(loginDao.verifyIdentity()){
					listener.managerLogined();
				}else {
					listener.userLogined();
				}
			}else {
				listener.loginFail();
			}
	}
	//��¼�����ӿ�
	public interface LoginListener{
		void loginFail();
		void managerLogined();
		void userLogined();
	}
}
