package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsBGroup;

public interface IsBGroupService {

	 public int insert(IsBGroup record);
	 
	 
	 public List<IsBGroup> findList(IsBGroup record);
	 
	 public int deleteByPrimaryKey(Integer pk_group);
	 
	 public int updateByPrimaryKey(IsBGroup record);
	 
	 public IsBGroup selectByPrimaryKey(Integer pk_group);
}
