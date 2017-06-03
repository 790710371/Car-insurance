package com.safeCar.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.safeCar.Config;
import com.safeCar.Bean.User;
import com.safeCar.Dao.impl.AdminQueryDaoImpl;
import com.safeCar.Service.impl.QueryUserInfoImpl;

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
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type","text/html;charset=UTF-8");
		// TODO Auto-generated method stub
		System.out.println("session����");
		String action = request.getParameter(Config.KEY_ACTION);//action
		String page = request.getParameter(Config.VALUE_PAGE);//��ѯ��ҳ��
		if(action!=null){
			switch (action) {
			case Config.VALUE_ADMIN_QUERY:
				String usr_name=request.getParameter("usr_name");//����
				AdminQueryDaoImpl adminQueryDaoImpl = new AdminQueryDaoImpl();
				List<User> user_list = adminQueryDaoImpl.queryUserInfo(usr_name);
				String jsonString = new QueryUserInfoImpl().retJsonUserString(user_list);
				response.getWriter().println(jsonString);
				//response.getWriter().print("{'pages':500,'usr_info':[{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'},{'usr_account':'Mero','usr_name':'����','usr_email':'790710371@qq.com','usr_phone':'17865676554','usr_IDcard':'420212125521223255','usr_carID':'��x:4s5a52'}]}");
				break;
			case Config.VALUE_ADD_USER:
				//������û�
				break;
			case Config.VALUE_DEL_USR:
				//ɾ���û�
				break;
			case Config.VALUE_OPEREATE_RECORD:
				//����Ա������¼
				break;
				//���ù���Ա
			case Config.VALUE_SETTING_ADMIN:
				break;
			case Config.VALUE_RECHARGR:
				break;
			}
		}
	}

}
