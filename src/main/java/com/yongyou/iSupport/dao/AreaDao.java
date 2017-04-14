package com.yongyou.iSupport.dao;

import java.util.List;

import com.yongyou.iSupport.entity.Area;

public interface AreaDao {
	
	public int insertArea(Area area);

	public List<Area> findList(Area area);
	
	public int deleteByPrimaryKey(Integer pk_area);
	
	public int updateByPrimaryKey(Area area);
	
	public Area selectByPrimaryKey(Integer pk_area);
}
