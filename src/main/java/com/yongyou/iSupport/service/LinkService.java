package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsLink;

public interface LinkService {

	public List<IsLink> findList(IsLink link);
	
	int insert(IsLink record);
	
	int deleteByPrimaryKey(Integer pkLink);
	
	IsLink selectByPrimaryKey(Integer pkLink);
	
	int updateByPrimaryKey(IsLink record);
}
