package com.safeCar.Dao;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;

import com.safeCar.Bean.LoginInfo;

public interface ILoginDao {
	//�û���¼��ѯ�Ƿ��˺�������ȷ�����ز�ѯ���true�����ѯ�ɹ���false����ʧ��
	public boolean query(LoginInfo info,HttpServletRequest requests);
	//��֤��ݣ�����true�����ǹ���Ա������false�����ǹ���Ա
	public boolean verifyIdentity();
}
