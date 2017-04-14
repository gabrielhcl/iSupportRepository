package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsBCorp;

public interface CorpService {

	public int insert(IsBCorp record);
	
	public List<IsBCorp> findList(IsBCorp corp);
	
	public int deleteByPrimaryKey(Integer pkCorp);
	
	public IsBCorp selectByPrimaryKey(Integer pkCorp);
	
	public int updateByPrimaryKey(IsBCorp record);
}
