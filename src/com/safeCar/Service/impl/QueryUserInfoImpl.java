package com.safeCar.Service.impl;

import java.util.List;

import com.safeCar.Bean.User;
import com.safeCar.Service.IQueryUserInfo;

public class QueryUserInfoImpl implements IQueryUserInfo{

	@Override
	public String retJsonUserString(List<User> user_list) {
		String retJsonUserString = null;
		int pages = 0 ;
		int size = user_list.size();
		//˵��ҳ�벻Ϊ��������ʱҳ������Ϊsize/5+1
		if(size!=0){
			//˵���鵽������
			if(size%5!=0){
				//˵������һҳ����ʱҳ����Ϊsize/5+1
				pages = size/5+1;
				//���������ݷ�װ��json���ݷ���ǰ��
				StringBuilder sb = new StringBuilder("");
				sb.append("{'pages':").append(pages).append(",'usr_info':[");
				for(User u:user_list){
						sb.append("{'usr_account':").append("'").append(u.getUsr_loginInfo().getUsr_account()).append("'");
						sb.append(",'usr_name':").append("'").append(u.getUsr_name()).append("'");
						sb.append(",'usr_email':").append("'").append(u.getUsr_email()).append("'");
						sb.append(",'usr_phone':").append("'").append(u.getUsr_phone()).append("'");
						sb.append(",'usr_IDcard':").append("'").append(u.getUsr_IDcard()).append("'");
						sb.append(",'usr_carID':").append("'").append(u.getUsr_carID()).append("'");
						sb.append("},");
				}
				sb.deleteCharAt(sb.length()-1);
				sb.append("]}");
				retJsonUserString = sb.toString();
				System.out.println(retJsonUserString);
			}
		}
	
		return retJsonUserString;
	}

}
