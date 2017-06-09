package com.safeCar.Service;

import java.util.List;

import com.safeCar.Bean.OperateRecord;

public interface IOperateService {
	public String getJsonString(List<OperateRecord> list);
}
