package com.safeCar.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.safeCar.Bean.InsureRecord;
import com.safeCar.Dao.ICashBackDao;
import com.safeCar.tools.DBUtils;

public class CashBackDaoImpl implements ICashBackDao{
	Connection conn;
	public CashBackDaoImpl(){
		conn = DBUtils.getConnection();
	}
	/*
	 * 获取投保日期和返现次数
	 */
	@Override
	public List<InsureRecord> getInsureRecord(String insure_account) {
		List<InsureRecord> insureRecordsList = new ArrayList<InsureRecord>();
		String sql = "SELECT `data_insure`, `ret_count` FROM `insure_record` WHERE insure_account=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, insure_account);
			 ResultSet set = pst.executeQuery();
			 while(set.next()){
				 Date date_insure = set.getDate(1);
				 int ret_count = set.getInt(2);
				 InsureRecord insureRecord = new InsureRecord();
				 insureRecord.setDate_insure(date_insure);
				 insureRecord.setRet_count(ret_count);
				 insureRecordsList.add(insureRecord);
				 return insureRecordsList;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateRetCount(int ret_count,String data_insure,String account) {
		String sql = "UPDATE `insure_record` SET `ret_count`=? WHERE data_insure=?";
		try {
			PreparedStatement pst  = conn.prepareStatement(sql);
			pst.setInt(1, ret_count);
			pst.setString(2, data_insure);
			int rows = pst.executeUpdate();
			if(rows>0){
				String sql1 = "UPDATE `cashback` SET`cashback`=? WHERE cash_back_account=?";
				PreparedStatement pst1  = conn.prepareStatement(sql1);
				pst1.setDouble(1, ret_count*(2500/12));
				pst1.setString(2, account);
				int rows1 = pst1.executeUpdate();
				if(rows1>0){
					System.out.println("更新返现余额成功");
				}
			}
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean insertRetCount(int count,String account) {
		String sql = "UPDATE `insure_record` SET `ret_count`=? WHERE insure_account=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, count);
			pst.setString(2, account);
			int  rows = pst.executeUpdate();
			if(rows>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public double queryCashBack(String account) {
		double cash = 0 ;
		String sql = "SELECT `cashback` FROM `cashback` WHERE cash_back_account=?";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, account);
			ResultSet set = pst.executeQuery();
			while(set.next()){
				cash = set.getDouble(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cash;
	}
	@Override
	public boolean insertRetCash(double cashback,String cash_back_account) {
		String sql = "UPDATE `cashback` SET `cashback`=? WHERE cash_back_account=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setDouble(1, cashback);
			pst.setString(2,cash_back_account);
			int rows = pst.executeUpdate();
			if(rows>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
