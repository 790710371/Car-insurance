package com.safeCar.Dao;

import com.safeCar.Bean.User;

public interface IRegisterDao {
		/*
		 * return true�ɹ�,falseʧ��
		 */
		public  boolean insert(User user);//�����û�
		/*
		 * return true���ڣ�false������
		 */
		public boolean query(User user);//��ѯ�û������Ƿ����
}
