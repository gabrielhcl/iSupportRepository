package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsSDweekplaneHDao;
import com.yongyou.iSupport.entity.IsSDweekplaneH;
import com.yongyou.iSupport.service.IsSDweekplaneHService;

@Service("isSDweekplaneHService")
public class IsSDweekplaneHServiceImpl implements IsSDweekplaneHService{
	
	@Autowired
	private IsSDweekplaneHDao  isSDweekplaneHDao;
	
	@Override
	public int insert(IsSDweekplaneH record){
		return this.isSDweekplaneHDao.insert(record);
	}
	
	@Override
	public List<IsSDweekplaneH> findList(IsSDweekplaneH record){
		return this.isSDweekplaneHDao.findList(record);
	}
}
