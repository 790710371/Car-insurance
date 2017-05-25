package com.safeCar.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.safeCar.Config;

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
		String action = request.getParameter(Config.KEY_ACTION);
		if(action!=null){
			switch (action) {
			case Config.VALUE_ADMIN_QUERY:
				//����Ա��ѯ�û���Ϣ
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
			}
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
