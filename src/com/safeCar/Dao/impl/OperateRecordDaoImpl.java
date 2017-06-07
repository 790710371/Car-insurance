package com.safeCar.Dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.safeCar.Dao.IOperateRecordDao;
import com.safeCar.tools.DBUtils;

public class OperateRecordDaoImpl implements IOperateRecordDao{
	private Connection conn;
	public OperateRecordDaoImpl(){
		conn = (Connection) DBUtils.getConnection();
	}
	@Override
	public boolean insertOperateRecord(Object... obj) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO `operation_record`(`id`, `operation_account`, `identity_id`, `operate_type`, `ip_address`, `operate_date`) VALUES (null,?,?,?,?,?)";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,(String) obj[0]);
			pst.setInt(2, (int) obj[1]);
			pst.setString(3, (String) obj[2]);
			pst.setString(4, (String) obj[3]);
			pst.setString(5, (String) obj[4]);
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean queryOperateRecord(String usr_account) {
		String sql ="SELECT `id`, `identity_id`, `operate_type`, `ip_address`, `operate_date` FROM `operation_record` WHERE operation_account=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, usr_account);
			pst.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
