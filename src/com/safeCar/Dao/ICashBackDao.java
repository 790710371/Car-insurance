package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.InsureRecord;

public interface ICashBackDao {
		//查询投保记录表的返现次数和投保日期
		public  List<InsureRecord> getInsureRecord(String insure_account);
		//更新返现次数
		public boolean updateRetCount(int ret_count,String data_insure,String account);
		//插入返现次数
		public boolean insertRetCount(int count,String account);
		//插入返现余额
		public boolean insertRetCash(double cashback,String cash_back_account);
		//查询返现余额
		public double queryCashBack(String account);
}
