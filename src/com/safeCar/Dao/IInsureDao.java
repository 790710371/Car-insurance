package com.safeCar.Dao;

import java.util.List;

import com.safeCar.Bean.User;

public interface IInsureDao {
		//查询当前姓名所存在的用户
		public List<User> getUserList(String user_name);
		//查询用户当前余额,返回用户余额的id
		public int[] queryCashLeft(String account);
		//余额充值,money代表要充值的金额
		public boolean recharge(int id,int cash,int money);
		//用户投保,扣除余额5000作为投保，id为用户余额表的id
		public boolean insureUpdate(int id,int money);
		//插入投保记录
		public boolean insertInsureRecord(String nowTime,int ret_count);
		//更新返现次数
		public boolean insureCountUpdate(int id,int ret_count);
		//余额修车
		public boolean fix(int id,int money);
}
