package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsColumn;

public interface ColumnService {

	int insert(IsColumn record);
	
	public List<IsColumn> findList(IsColumn column);
	
	IsColumn selectByPrimaryKey(Integer pkColumn);
	
	int updateByPrimaryKey(IsColumn record);
	
	int deleteByPrimaryKey(Integer pkColumn);
}
