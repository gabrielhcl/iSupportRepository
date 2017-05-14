package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsLinkcolumnDao;
import com.yongyou.iSupport.entity.IsLinkcolumn;
import com.yongyou.iSupport.service.LinkColumnService;

@Service("linkColumnService")
public class LinkColumnServiceImpl implements LinkColumnService {

	@Autowired
	private IsLinkcolumnDao isLinkcolumnDao;
	
	@Override
	public int deleteByPrimaryKey(Integer pkColumn) {
		// TODO Auto-generated method stub
		return this.isLinkcolumnDao.deleteByPrimaryKey(pkColumn);
	}

	@Override
	public int insert(IsLinkcolumn record) {
		// TODO Auto-generated method stub
		return this.isLinkcolumnDao.insert(record);
	}

	@Override
	public IsLinkcolumn selectByPrimaryKey(Integer pkColumn) {
		// TODO Auto-generated method stub
		return this.isLinkcolumnDao.selectByPrimaryKey(pkColumn);
	}

	@Override
	public int updateByPrimaryKey(IsLinkcolumn record) {
		// TODO Auto-generated method stub
		return this.isLinkcolumnDao.updateByPrimaryKey(record);
	}

	@Override
	public List<IsLinkcolumn> findList(IsLinkcolumn record) {
		// TODO Auto-generated method stub
		return this.isLinkcolumnDao.findList(record);
	}

}
