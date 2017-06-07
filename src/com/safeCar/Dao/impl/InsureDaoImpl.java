package com.safeCar.Dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.safeCar.Bean.LoginInfo;
import com.safeCar.Bean.User;
import com.safeCar.Bean.UserCashLeft;
import com.safeCar.Dao.IInsureDao;
import com.safeCar.tools.DBUtils;

public class InsureDaoImpl implements IInsureDao{
	private static final int CASH_TO_INSURE = 5000;//每年投保所需要的固定费用
	private static final int CASH_TO_FIX = 250;//每次修车的固定费用
	private Connection conn;
		public InsureDaoImpl(){
			conn = (Connection) DBUtils.getConnection();
		}
/*
 * @queryCashLeft 查询用户余额
 * @account 用户名
 */
	@Override
	public int[] queryCashLeft(String account) {
		String sql = "select user_cash_left.id_cash_left, user_cash_left.usr_cash from user_cash_left,logininfo,user where user.id_cash_left=user_cash_left.id_cash_left and user.login_info_id=logininfo.login_info_id AND logininfo.usr_account=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, account);
			ResultSet set = pst.executeQuery();
			while(set.next()){
			int id = set.getInt(1);
			int cash = set.getInt(2);
			 System.out.println("当前余额"+String.valueOf(cash));
			 return new int[]{id,cash};
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*@recharge	充值 
	 * @id 当前用户余额的id
	 * @money 充值余额
	 * @cash 当前余额
	 */
	@Override
	public boolean recharge(int id,int cash,int money) {
		int total_money = money+cash;
		String sql = "UPDATE `user_cash_left` SET `usr_cash`=? WHERE id_cash_left=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, total_money);
			pst.setInt(2, id);
			pst.executeUpdate();
			//进行数据库流的一个关闭操作
			DBUtils.closeConnection(conn);
			DBUtils.closePreparedStatement(pst);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean insureUpdate(int id,int money) {
			//扣除之后的余额
			int leftMoney = money-CASH_TO_INSURE;
			//更新扣除之后的余额
			String sql = "UPDATE `user_cash_left` SET `usr_cash`=? WHERE id_cash_left=?";
			try {
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, leftMoney);
				pst.setInt(2, id);
				pst.executeUpdate();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;
	}
	/*插入投保记录
	 *@nowTime 当前的时间
	 * @ret_count 返现的次数
	 */
	@Override
	public boolean insertInsureRecord(String nowTime,int ret_count) {
		Date date = new Date();
		//获取当前的时间
		//String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date.getTime());
		String sql = "INSERT INTO `insure_record`(`id_insure`, `data_insure`, `ret_count`) VALUES (NULL,?,?)";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1,nowTime );//插入当前的时间
			pst.setInt(2,ret_count);//插入计时的标志
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/*
	 * 更新返现次数
	 * @id 记录表的id
	 * @ret_count 返现次数
	 */
	@Override
	public boolean insureCountUpdate(int id,int ret_count) {
		String sql = " UPDATE `insure_record` SET `ret_count`=? WHERE id_insure=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, ret_count);
			pst.setInt(2, id);
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	/*
	 *得到所有查询用户
	 * @user_name 用户姓名
	 */
	@Override
	public List<User> getUserList(String user_name) {
		List<User> list_user = new ArrayList<User>();//用来存储查询到的用户
		String sql = "SELECT user.id,logininfo.usr_account,user.usr_name,user_cash_left.usr_cash FROM user,logininfo,user_cash_left where user.login_info_id=logininfo.login_info_id and user.id_cash_left = user_cash_left.id_cash_left and user.usr_name = ?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user_name);
			ResultSet set = pst.executeQuery();
			while(set.next()){
				int id = set.getInt(1);
				String usr_account= set.getString(2);
				String usr_name = set.getString(3);
				int usr_cash = set.getInt(4);
				System.out.println("id:"+id+"usr_account:"+usr_account+"usr_name:"+usr_name+"usr_cash:"+usr_cash);
				User user = new User();
				user.setId(id);
				user.setUsr_name(usr_name);
				LoginInfo info = new LoginInfo();
				info.setUsr_account(usr_account);
				UserCashLeft userCashLeft = new UserCashLeft();
				userCashLeft.setMoney(usr_cash);
				user.setUsr_loginInfo(info);
				user.setUsr_balance(userCashLeft);
				list_user.add(user);
			}
			return list_user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public boolean fix(int id,int money) {
		//扣除之后的余额
		int leftMoney = money-CASH_TO_FIX;
		//更新扣除之后的余额
		String sql = "UPDATE `user_cash_left` SET `usr_cash`=? WHERE id_cash_left=?";
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, leftMoney);
			pst.setInt(2, id);
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
}
}
