package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsBShanxiDao;
import com.yongyou.iSupport.entity.IsBShanxi;
import com.yongyou.iSupport.service.ShanXiService;

@Service("shanXiService")
public class ShanXiServiceImpl implements ShanXiService {

	@Autowired
	private IsBShanxiDao isBShanxiDao;
	
	@Override
	public List<IsBShanxi> findList(IsBShanxi record){
		return this.isBShanxiDao.findList(record);
	}
}
