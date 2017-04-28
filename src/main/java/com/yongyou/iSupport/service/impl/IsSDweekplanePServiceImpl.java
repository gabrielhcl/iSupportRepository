package com.yongyou.iSupport.service.impl;

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

}
