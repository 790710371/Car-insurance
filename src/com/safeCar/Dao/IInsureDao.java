package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.User;

public interface IInsureDao {
		//��ѯ��ǰ���������ڵ��û�
		public List<User> getUserList(String user_name);
		//��ѯ�û���ǰ���,�����û�����id
		public int[] queryCashLeft(String account);
		//����ֵ,money����Ҫ��ֵ�Ľ��
		public boolean recharge(int id,int cash,int money);
		//�û�Ͷ��,�۳����5000��ΪͶ����idΪ�û������id
		public boolean insureUpdate(int id,int money);
		//����Ͷ����¼
		public boolean insertInsureRecord(String nowTime,int ret_count);
		//���·��ִ���
		public boolean insureCountUpdate(int id,int ret_count);
		//����޳�
		public boolean fix(int id,int money);
}
