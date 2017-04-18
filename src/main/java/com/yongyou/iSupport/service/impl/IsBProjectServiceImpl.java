package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsBProjectDao;
import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.service.IsBProjectService;


@Service("isBProjectService")
public class IsBProjectServiceImpl implements IsBProjectService {

	@Autowired
	private IsBProjectDao isBProjectDao;
	
	@Override
	public int insert(IsBProject record){
		return this.isBProjectDao.insert(record);
	}
	
	@Override
	public List<IsBProject> findList(IsBProject record){
		return this.isBProjectDao.findList(record);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkProject){
		return this.isBProjectDao.deleteByPrimaryKey(pkProject);
	}
	
	@Override
	public IsBProject selectByPrimaryKey(Integer pkProject){
		return this.isBProjectDao.selectByPrimaryKey(pkProject);
	}
	
	@Override
	public int updateByPrimaryKey(IsBProject record){
		return this.isBProjectDao.updateByPrimaryKey(record);
	}
}
