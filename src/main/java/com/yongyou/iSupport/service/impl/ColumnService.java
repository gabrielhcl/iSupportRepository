package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsColumnDao;
import com.yongyou.iSupport.entity.IsColumn;

@Service("columnService")
public class ColumnService implements com.yongyou.iSupport.service.ColumnService {

	@Autowired
	private IsColumnDao isColumnDao;
	
	@Override
	public int insert(IsColumn record) {
		// TODO Auto-generated method stub
		return this.isColumnDao.insert(record);
	}
	
	@Override
	public List<IsColumn> findList(IsColumn column){
		return this.isColumnDao.findList(column);
	}
	
	@Override
	public IsColumn selectByPrimaryKey(Integer pkColumn){
		return this.isColumnDao.selectByPrimaryKey(pkColumn);
	}
	
	@Override
	public int updateByPrimaryKey(IsColumn record){
		return this.isColumnDao.updateByPrimaryKey(record);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkColumn){
		return this.isColumnDao.deleteByPrimaryKey(pkColumn);
	}
	
	@Override
	public List <IsColumn> findListBySort(IsColumn column){
		return this.isColumnDao.findListBySort(column);
	}
	

}
