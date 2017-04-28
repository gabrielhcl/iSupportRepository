package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsLinkDao;
import com.yongyou.iSupport.entity.IsLink;
import com.yongyou.iSupport.service.LinkService;

@Service("linkService")
public class LinkServiceImpl implements LinkService {

	@Autowired
	private IsLinkDao linkDao;
	
	@Override
	public List<IsLink> findList(IsLink link) {
		// TODO Auto-generated method stub
		return this.linkDao.findList(link);
	}

	@Override
	public int insert(IsLink record){
		return this.linkDao.insert(record);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkLink){
		return this.linkDao.deleteByPrimaryKey(pkLink);
	}
	
	@Override
	public IsLink selectByPrimaryKey(Integer pkLink){
		return this.linkDao.selectByPrimaryKey(pkLink);
	}
	
	@Override
	public int updateByPrimaryKey(IsLink record){
		return this.linkDao.updateByPrimaryKey(record);
	}
}
