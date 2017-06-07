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
import com.safeCar.Dao.impl.InsureDaoImpl;
import com.safeCar.Service.impl.QueryUserInfoImpl;
import com.safeCar.Service.impl.UserInsureImpl;

/**
 * Servlet implementation class AdminQueryServlet
 */
@WebServlet("/AdminQueryServlet")
public class AdminServlet extends HttpServlet {
	private static final int INSURE_CASH = 5000;//Ͷ��������
	private static final int FIX_CASH = 250;//�޳�һ�εķ���
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
		if(action!=null){
			switch (action) {
			case Config.VALUE_ADMIN_QUERY:
				String usr_name=request.getParameter("usr_name");//����
				System.out.println(usr_name);
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
			case Config.VALUE_QUERY_CASH:
				String usr_a=request.getParameter("usr_account");//�û���
				InsureDaoImpl in = new InsureDaoImpl();
				int[] i_arr = in.queryCashLeft(usr_a);
				response.getWriter().print("{'status':0,'errCode':0x0,'message':'��ѯ�ɹ�','usr_cash':"+i_arr[1]+"}");
				break;
				//��ѯ�û�Ͷ������Ϣ
			case Config.VALUE_ADMIN_QUERY_INSURE:
				String usr_name1=request.getParameter("usr_name");//����
				System.out.println(usr_name1);
				UserInsureImpl userInsureImpl = new UserInsureImpl();
				System.out.println(userInsureImpl);
				InsureDaoImpl insureDaoImpl = new InsureDaoImpl();
				System.out.println(insureDaoImpl);
				List<User> list = insureDaoImpl.getUserList(usr_name1);
				System.out.println(list);
				System.out.println(list);
				String jsonString1 = userInsureImpl.getJsonString(list);
				response.getWriter().println(jsonString1);
				break;
				//�û���ֵ
			case Config.VALUE_RECHARGR:
				String usr_account0 = request.getParameter("usr_account");
				int cashToRecharge = Integer.parseInt(request.getParameter("usr_cash"));
				InsureDaoImpl insureDaoImpl2  =new InsureDaoImpl();
				int[] arr2 = insureDaoImpl2.queryCashLeft(usr_account0);//��ѯ���
				int cash_left_id2 = arr2[0];//�û����id
				int cash_left2 = arr2[1];//�û����
				boolean isSuccRecharged = insureDaoImpl2.recharge(cash_left_id2, cash_left2, cashToRecharge);
				if(isSuccRecharged){
					response.getWriter().print("{'status':0,'errCode':0x0,'message':'��ֵ�ɹ�'}");
				}else{
					response.getWriter().print("{'status':0,'errCode':0x1,'message':'��ֵʧ�ܣ��������쳣'}");
				}
				break;
			case Config.VALUE_INSURE:
				//�û�Ͷ��
				String usr_account = request.getParameter("usr_account");
				InsureDaoImpl insureDaoImpl0  =new InsureDaoImpl();
				int[] arr = insureDaoImpl0.queryCashLeft(usr_account);//��ѯ���
				int cash_left_id = arr[0];//�û����id
				int cash_left = arr[1];//�û����
				System.out.println("cash_left_id:"+cash_left_id+"cash_left:"+cash_left);
				//�ж�����Ƿ���㣬Ͷ��������Ҫ��ֵ
				if(cash_left<5000){
					System.out.println("����");
					//��Ҫ��ֵ
					response.getWriter().print("{'status':0,'errCode':0x1,'message':'����'}");
					return;
				}else{
					System.out.println("ֱ�ӽ���Ͷ��");
					//ֱ�ӽ���Ͷ��
					boolean isSuccFlag = insureDaoImpl0.insureUpdate(cash_left_id, cash_left);
					if(isSuccFlag){
						//Ͷ���ɹ�
						response.getWriter().print("{'status':1,'errCode':0x0,'message':'Ͷ���ɹ�'}");
					}else{
						//Ͷ��ʧ��
						response.getWriter().print("{'status':0,'errCode':0x1,'message':'Ͷ��ʧ�ܣ��������쳣'}");
					}
				}
				break;
			case Config.VALUE_CAR_FIX:
				//�û��޳�
				String usr_account5 = request.getParameter("usr_account");
				InsureDaoImpl insureDaoImpl5  =new InsureDaoImpl();
				int[] arr5 = insureDaoImpl5.queryCashLeft(usr_account5);//��ѯ���
				int cash_id5 = arr5[0];//�û����id
				int cash_left5 = arr5[1];//�û����
				//�ж�����Ƿ���㣬�޳�������Ҫ��ֵ
				if(cash_left5<FIX_CASH){
					//��Ҫ��ֵ
					response.getWriter().print("{'status':0,'errCode':0x1,'message':'����'}");
					return;
				}else{
					//ֱ�ӽ����޳�
					boolean isSuccFlag = insureDaoImpl5.fix(cash_id5, cash_left5);
					if(isSuccFlag){
						//�޳��ɹ�
						response.getWriter().print("{'status':1,'errCode':0x0,'message':'�޳��ɹ�'}");
					}else{
						//�޳�ʧ��
						response.getWriter().print("{'status':0,'errCode':0x1,'message':'�޳�ʧ�ܣ��������쳣'}");
					}
				}
				break;
			}
		}
	}
}
