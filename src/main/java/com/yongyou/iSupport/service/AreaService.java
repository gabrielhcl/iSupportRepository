package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.Area;

public interface AreaService {

	public int insertArea(Area area);
	
	public List<Area> findList(Area area);
	
	public int deleteByPrimaryKey(Integer pk_area);
	
	public int updateByPrimaryKey(Area area);
	
	public Area selectByPrimaryKey(Integer pk_area);
	
	Area selectByCode(String areacode);
}
