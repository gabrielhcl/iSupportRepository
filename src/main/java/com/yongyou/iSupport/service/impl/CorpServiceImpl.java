package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsBCorpDao;
import com.yongyou.iSupport.entity.IsBCorp;
import com.yongyou.iSupport.service.CorpService;


@Service("corpService")
public class CorpServiceImpl implements CorpService {
	
	@Autowired
	private IsBCorpDao isBCorpDao;
	
	
	@Override
	public int insert(IsBCorp record){
		return this.isBCorpDao.insert(record);
	}
	
	@Override
	public List<IsBCorp> findList(IsBCorp corp){
		return this.isBCorpDao.findList(corp);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkCorp){
		return this.isBCorpDao.deleteByPrimaryKey(pkCorp);
	}
	
	@Override
	public IsBCorp selectByPrimaryKey(Integer pkCorp){
		return this.isBCorpDao.selectByPrimaryKey(pkCorp);
	}
	
	@Override
	public int updateByPrimaryKey(IsBCorp record){
		return this.isBCorpDao.updateByPrimaryKey(record);
	}
}
