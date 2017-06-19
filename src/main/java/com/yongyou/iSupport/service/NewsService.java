package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsNews;

public interface NewsService {
	
	int insert(IsNews record);

	public List<IsNews> findList(IsNews news);
	
	int deleteByPrimaryKey(Integer pkNews);
	
	IsNews selectByPrimaryKey(Integer pkNews);
	
	int updateByPrimaryKey(IsNews record);
	
	public int insertNews(IsNews news);
	
	public List<IsNews> findNewsByColumn(IsNews news);
	
	public List<IsNews> selectByPkColumn(Integer pkColumn);
	
	int selectcountbycolumncode(Integer pk_column);
	
	 public List<IsNews> selectByiscarousel(String record);
	 
	 List<IsNews> findListByIstop(IsNews record);
	 
	 List<IsNews> findImgListOrderDate(IsNews record);
}
