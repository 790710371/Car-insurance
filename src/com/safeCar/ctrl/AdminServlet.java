package com.safeCar.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.safeCar.Config;
import com.safeCar.tools.BaseUtils;

/**
 * Servlet implementation class AdminQueryServlet
 */
@WebServlet("/AdminQueryServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("session存在");
		String action = request.getParameter(Config.KEY_ACTION);//action
		String page = request.getParameter(Config.VALUE_PAGE);//查询的页码
		if(action!=null){
			switch (action) {
			case Config.VALUE_ADMIN_QUERY:
				String usr_name=request.getParameter("usr_name");//姓名
				//查询用户信息
				response.getWriter().print("{'pages':500,'usr_info':[{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'},{'usr_account':'Mero','usr_name':'张三','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'粤x:4s5a52'}]}");
				break;
			case Config.VALUE_ADD_USER:
				//添加新用户
				break;
			case Config.VALUE_DEL_USR:
				//删除用户
				break;
			case Config.VALUE_OPEREATE_RECORD:
				//管理员操作记录
				break;
				//设置管理员
			case Config.VALUE_SETTING_ADMIN:
				break;
			}
		}
	}

}
