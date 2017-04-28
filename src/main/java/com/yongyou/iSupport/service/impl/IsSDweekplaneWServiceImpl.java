package com.yongyou.iSupport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsSDweekplaneWDao;
import com.yongyou.iSupport.entity.IsSDweekplaneW;
import com.yongyou.iSupport.service.IsSDweekplaneWService;

@Service("isSDweekplaneWService")
public class IsSDweekplaneWServiceImpl implements IsSDweekplaneWService {

	@Autowired
	private IsSDweekplaneWDao isSDweekplaneWDao; 
	
	@Override
	public int insert(IsSDweekplaneW record) {
		// TODO Auto-generated method stub
		return this.isSDweekplaneWDao.insert(record);
	}

}
