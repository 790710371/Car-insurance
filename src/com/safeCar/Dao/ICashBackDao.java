package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.InsureRecord;

public interface ICashBackDao {
		//��ѯͶ����¼��ķ��ִ�����Ͷ������
		public  List<InsureRecord> getInsureRecord(String insure_account);
		//���·��ִ���
		public boolean updateRetCount(int ret_count,String data_insure,String account);
		//���뷵�ִ���
		public boolean insertRetCount(int count,String account);
		//���뷵�����
		public boolean insertRetCash(double cashback,String cash_back_account);
		//��ѯ�������
		public double queryCashBack(String account);
}
