package com.yongyou.iSupport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsSDweekplaneNDao;
import com.yongyou.iSupport.entity.IsSDweekplaneN;
import com.yongyou.iSupport.service.IsSDweekplaneNService;


@Service("isSDweekplaneNService")
public class IsSDweekplaneNServiceImpl implements IsSDweekplaneNService {

	@Autowired
	private IsSDweekplaneNDao isSDweekplaneNDao; 
	
	@Override
	public int insert(IsSDweekplaneN record) {
		// TODO Auto-generated method stub
		return this.isSDweekplaneNDao.insert(record);
	}
}
