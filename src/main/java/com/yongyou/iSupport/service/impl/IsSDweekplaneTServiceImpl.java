package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsSDweekplaneTDao;
import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.service.IsSDweekplaneTService;


@Service("isSDweekplaneTService")
public class IsSDweekplaneTServiceImpl implements IsSDweekplaneTService{

	@Autowired
	private IsSDweekplaneTDao  isSDweekplaneTDao;
	
	@Override
	public int insert(IsSDweekplaneT record){
		return this.isSDweekplaneTDao.insert(record);
	}
	
	@Override
	public int deleteByHeadKey(Integer pkDweekplaneH){
		return this.isSDweekplaneTDao.deleteByHeadKey(pkDweekplaneH);
	}
	
	@Override
	public List<IsSDweekplaneT> selectByHeadKey(Integer pkSDweekplaneN){
		return this.isSDweekplaneTDao.selectByHeadKey(pkSDweekplaneN);
	}
}
