package com.safeCar.Dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.safeCar.Bean.LoginInfo;
import com.safeCar.Bean.User;
import com.safeCar.Dao.IAdminQueryDao;
import com.safeCar.tools.DBUtils;

public class AdminQueryDaoImpl implements IAdminQueryDao{
	private  Connection conn;
	 public AdminQueryDaoImpl() {
		 conn = (Connection) DBUtils.getConnection();
		}
	@Override
	public List<User> queryUserInfo(String usr_name) {
		List<User> user_list = new ArrayList<User>();
		//������й������ѯ���������Ƿ���ȷ
		String sql = "select user.usr_name,user.usr_email,user.usr_phone,user.usr_IDcard,user.usr_carID,logininfo.usr_account from user,logininfo where user.login_info_id=logininfo.login_info_id and user.usr_name=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, usr_name);
			ResultSet set = pst.executeQuery();//����Ԥ��ѯ���еĻ�����executeUpdata
			while(set.next()){
				//int id = set.getInt(1);
				//String usr_name = set.getString(1);//���ﲻ���ٲ��Ѿ�֪��
				String usr_email = set.getString(2);
				String usr_phone = set.getString(3);
				String usr_IDcard = set.getString(4);
				String usr_carID = set.getString(5);
				String usr_account = set.getString(6);
				LoginInfo info = new LoginInfo();
				info.setUsr_account(usr_account);//���ｫ��ѯ�����û�������User�µ�LoginInfo����
				User user = new User();
				user.setUsr_name(usr_name);
				user.setUsr_email(usr_email);
				user.setUsr_phone(usr_phone);
				user.setUsr_IDcard(usr_IDcard);
				user.setUsr_carID(usr_carID);
				user.setUsr_loginInfo(info);
				//���user����ֵ�������ӵ�list���ϳ���
				user_list.add(user);
			}
			return user_list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
