package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsSDweekplanePDao;
import com.yongyou.iSupport.entity.IsSDweekplaneP;
import com.yongyou.iSupport.service.IsSDweekplanePService;

@Service("isSDweekplanePService")
public class IsSDweekplanePServiceImpl implements IsSDweekplanePService {

	@Autowired
	private IsSDweekplanePDao isSDweekplanePDao;
	
	@Override
	public int insert(IsSDweekplaneP record) {
		// TODO Auto-generated method stub
		return this.isSDweekplanePDao.insert(record);
	}

	
	@Override
	public int deleteByHeadKey(Integer pkDweekplaneH){
		return this.isSDweekplanePDao.deleteByHeadKey(pkDweekplaneH);
	}
	
	@Override
	public List<IsSDweekplaneP> selectByHeadKey(Integer pkSDweekplaneN){
		return this.isSDweekplanePDao.selectByHeadKey(pkSDweekplaneN);
	}
}
