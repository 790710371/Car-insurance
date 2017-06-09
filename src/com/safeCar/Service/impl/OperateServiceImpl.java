package com.safeCar.Service.impl;

import java.util.List;

import com.safeCar.Bean.OperateRecord;
import com.safeCar.Dao.impl.OperateRecordDaoImpl;
import com.safeCar.Service.IOperateService;

public class OperateServiceImpl implements IOperateService{
	public  List<OperateRecord> list;
	public OperateServiceImpl(List<OperateRecord> list){
		this.list= list;
	}
	@Override
	public String getJsonString(List<OperateRecord> list) {
		String jsonString = null;
		int size  = list.size();
		System.out.println("size的大小："+size);
		int pages ;
		if(size!=0){
			if(size%5!=0){
				pages = size%5+1;//页码数为size%5+1
				//把所有数据封装成json数据发给前端
				StringBuilder sb = new StringBuilder("");
				sb.append("{'pages':").append(pages).append(",'operate_record':[");
				for(OperateRecord u:list){
						sb.append("{'user_id':").append("'").append(u.getUser_id()).append("'");
						sb.append(",'operate_account':").append("'").append(u.getOperation_account()).append("'");
						sb.append(",'identity_flag':").append("'").append(u.getIdentity_flag()).append("'");
						sb.append(",'operate_type':").append("'").append(u.getOperate_type()).append("'");
						sb.append(",'operate_date':").append("'").append(u.getOperate_date()).append("'");
						sb.append("},");
				}
				sb.deleteCharAt(sb.length()-1);
				sb.append("]}");
				jsonString = sb.toString();
				return jsonString;
			}
		}
	
		return "";
	}
	
}
