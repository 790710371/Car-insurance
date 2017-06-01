package com.safeCar.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.safeCar.Config;
import com.safeCar.Bean.LoginInfo;
import com.safeCar.Bean.User;
import com.safeCar.Service.impl.LoginService;
import com.safeCar.Service.impl.RegisterService;
import com.safeCar.Service.impl.LoginService.LoginListener;
import com.safeCar.Service.impl.RegisterService.IFailCallback;
import com.safeCar.Service.impl.RegisterService.ISuccessCallback;
import com.safeCar.tools.BaseUtils;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String action = request.getParameter(Config.KEY_ACTION);
				if(null!=action){
					switch(action){
					case Config.VALUE_REGISTER:
						String usr_name = request.getParameter("usr_name");
						String usr_email = request.getParameter("usr_email");
						String usr_phone = request.getParameter("usr_phone");
						String usr_IDcard = request.getParameter("usr_IDcard");
						String usr_carID = request.getParameter("usr_carID");
						String usr_account = request.getParameter("usr_account");
						String usr_pwd = request.getParameter("usr_pwd");
						System.out.println(usr_name);
						User user = new User();
						user.setUsr_name(usr_name);
						user.setUsr_email(usr_email);
						user.setUsr_phone(usr_phone);
						user.setUsr_IDcard(usr_IDcard);
						user.setUsr_carID(usr_carID);
						LoginInfo in = new LoginInfo();
						in.setUsr_account(usr_account);
						in.setUsr_pwd(usr_pwd);
						user.setUsr_loginInfo(in);
						RegisterService userService = new RegisterService(user);
						userService.register(new ISuccessCallback() {
							
							@Override
							public void onSuccess() {
								try {
									request.getRequestDispatcher("/login.jsp").forward(request, response);
								} catch (ServletException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}, new IFailCallback() {
							
							@Override
							public void onFail() {
								try {
									response.getWriter().println("{status:0,errCode:0x1,message:'登录失败'}");
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						});
						break;
					case Config.VALUE_LOGIN:
//						boolean isSessionExist = BaseUtils.isSessionExist(request);
//						if(isSessionExist){
//							request.getRequestDispatcher("usr_query.jsp").forward(request, response);
//						}else{
							//登录
							LoginInfo info = new LoginInfo();
							String account = request.getParameter("usr_account");
							String pwd =request.getParameter("usr_pwd");
							info.setUsr_account(account);
							info.setUsr_pwd(pwd);
							LoginService loginService = new LoginService(info, request);
							loginService.login(new LoginListener() {
								
								@Override
								public void userLogined() {
									try {
										request.getRequestDispatcher("/UserInfo.jsp").forward(request, response);
									} catch (ServletException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								
								@Override
								public void managerLogined() {
									System.out.println("管理员登录成功");
									try {
										request.getRequestDispatcher("/usr_query.jsp").forward(request, response);
									} catch (ServletException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								
								@Override
								public void loginFail() {
									try {
										request.getRequestDispatcher("/login.jsp").forward(request, response);
									} catch (ServletException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							});
						break;
					case Config.VALUE_LOGOUT:
						System.out.println("正在准备注销");
					HttpSession session = 	request.getSession();
					if(null==session){
						response.sendRedirect(request.getContextPath()+"/login.jsp") ;
					}
					session.invalidate();
					response.sendRedirect(request.getContextPath()+"/login.jsp") ;
					break;
					}
				}
	}

}
