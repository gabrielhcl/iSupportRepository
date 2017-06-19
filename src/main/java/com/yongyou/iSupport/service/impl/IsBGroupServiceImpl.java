package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsBGroupDao;
import com.yongyou.iSupport.entity.IsBGroup;
import com.yongyou.iSupport.service.IsBGroupService;

@Service("isBGroupService")
public class IsBGroupServiceImpl implements IsBGroupService{
	
	@Autowired
	private IsBGroupDao isBGroupDao;
	
	@Override
	 public int insert(IsBGroup record){
		 return isBGroupDao.insert(record);
	 }
	
	@Override
	public List<IsBGroup> findList(IsBGroup record){
		return isBGroupDao.findList(record);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pk_group){
		return isBGroupDao.deleteByPrimaryKey(pk_group);
	}
	
	@Override
	public int updateByPrimaryKey(IsBGroup record){
		return isBGroupDao.updateByPrimaryKey(record);
	}
	
	@Override
	public IsBGroup selectByPrimaryKey(Integer pk_group){
		return isBGroupDao.selectByPrimaryKey(pk_group);
	}
	
	@Override
	public IsBGroup selectByCode(String groupcode){
		return isBGroupDao.selectByCode(groupcode);
	}
}
