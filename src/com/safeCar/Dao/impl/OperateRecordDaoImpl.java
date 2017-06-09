package com.safeCar.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.safeCar.Config;
import com.safeCar.Bean.OperateRecord;
import com.safeCar.Dao.IOperateRecordDao;
import com.safeCar.tools.BaseUtils;
import com.safeCar.tools.DBUtils;

public class OperateRecordDaoImpl implements IOperateRecordDao{
	private Connection conn;
	public OperateRecordDaoImpl(){
		conn = (Connection) DBUtils.getConnection();
	}
	@Override
	public boolean insertOperateRecord(String usr_account,String operateTypeUrl) {
		int id = 0;
		int flag;
		String identity_flag = null;
		String sql1 = "SELECT user.id,logininfo.flag from user,logininfo where user.login_info_id=logininfo.login_info_id and logininfo.usr_account=?";
		PreparedStatement pst1;
		try {
			pst1 = conn.prepareStatement(sql1);
			pst1.setString(1, usr_account);
			java.sql.ResultSet set = pst1.executeQuery();
			while(set.next()){
				id = set.getInt(1);
				flag = set.getInt(2);
				if(flag==0){
					identity_flag="";//������������ڣ����ݺ��ڷֹ���ԱȨ����
				}else if(flag==1){
					identity_flag="����Ա";
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			String sql = "INSERT INTO `operation_record`(`operate_id`,`user_id`, `operation_account`, `identity_flag`, `operate_type`, `operate_date`) VALUES (null,?,?,?,?,?)";
			PreparedStatement pst;
			try {
				pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2,usr_account);
				pst.setString(3,identity_flag );
				pst.setString(4,getOperateType(operateTypeUrl));
//				pst.setString(5, BaseUtils.getIpAddr());
				pst.setString(5,BaseUtils.getCurrentDate());
				pst.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		return false;
	}
	/*
	 * ��ѯ������¼
	 * @param startDate ��ʼ����
	 * @param endDate ��������
	 * @return List<OperateRecord>
	 */
	@Override
	public List<OperateRecord> queryOperateRecord(String startDate,String endDate) {
		List<OperateRecord> list= new ArrayList<OperateRecord>();
		int id = 0;
		String operation_account = null;
		String identity_flag=null;
		String operate_type = null;
		String operate_date = null;
		 System.out.println("startDate��"+startDate);
		 String[] arr = endDate.split("-");
		 arr[2]=String.valueOf(Integer.parseInt(arr[2])+1);
		 StringBuilder sb = new StringBuilder();
		 for(int i=0;i<arr.length;i++){
			 sb.append(arr[i]).append("-");
		 }
		 sb.deleteCharAt(sb.length()-1);
		 endDate = sb.toString();
		 System.out.println("endDate��"+endDate);
		String sql ="SELECT user_id,operation_account,identity_flag,operate_type,operate_date FROM `operation_record` WHERE ((operate_date>=?) and (operate_date<=?))";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, startDate);
			pst.setString(2, endDate);
			 System.out.println("queryOperateRecord��������");
			ResultSet set = pst.executeQuery();
			 System.out.println(set.next());
			while(set.next()){
				id = set.getInt(1);
				operation_account = set.getString(2);
				identity_flag = set.getString(3);
				operate_type = set.getString(4);
				 operate_date = set.getString(5);
				 OperateRecord operateRecord  = new OperateRecord();
				 operateRecord.setUser_id(id);
				 operateRecord.setOperation_account(operation_account);
				 operateRecord.setIdentity_flag(identity_flag);
				 operateRecord.setOperate_type(operate_type);
				 operateRecord.setOperate_date(operate_date);
				 list.add(operateRecord);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String getOperateType(String url) {
			String action =null;
			switch(url){
			case Config.VALUE_ADD_USER:
				action = "����û�";
				break;
			case Config.VALUE_LOGIN:
				action = "����Ա��¼";
				break;
			case Config.VALUE_OPEREATE_RECORD:
				action = "������¼��ѯ";
				break;
			case Config.VALUE_REGISTER:
				action = "ע���˺�";
				break;
			case Config.VALUE_SETTING_ADMIN:
				action = "���ù���Ա";
				break;
			case Config.VALUE_ADMIN_QUERY:
				action = "�����ѯ";
				break;
			case Config.VALUE_LOGOUT:
				action="ע����¼";
				break;
			case Config.VALUE_ADMIN_QUERY_INSURE:
				action = "Ͷ����ѯ";
				break;
			case Config.VALUE_CAR_FIX:
				action = "������";
				break;
			case Config.VALUE_DEL_USR:
				action = "ɾ���û�";
				break;
			case Config.VALUE_INSURE:
				action = "�û�Ͷ��";
				break;
			case Config.VALUE_QUERY_CASH:
				action = "��ѯ���";
				break;
			case Config.VALUE_RECHARGR:
				action = "�û���ֵ";
				break;
			}
			return action;
		};

}
