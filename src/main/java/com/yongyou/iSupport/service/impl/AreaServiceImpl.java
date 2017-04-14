package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.AreaDao;
import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.service.AreaService;

@Service("areaService")
public class AreaServiceImpl implements AreaService{

	@Autowired
	private AreaDao areaDao;
	
	@Override
	public int insertArea(Area area){
		return this.areaDao.insertArea(area);
	}
	
	
	@Override
	public List<Area> findList(Area area){
		return this.areaDao.findList(area);
	}
	
	@Override
	public  int deleteByPrimaryKey(Integer pk_area){
		return this.areaDao.deleteByPrimaryKey(pk_area);
	}
	
	@Override
	public int updateByPrimaryKey(Area area){
		return this.areaDao.updateByPrimaryKey(area);
	}
	
	@Override
	public Area selectByPrimaryKey(Integer pk_area){
		return this.areaDao.selectByPrimaryKey(pk_area);
	}
}
