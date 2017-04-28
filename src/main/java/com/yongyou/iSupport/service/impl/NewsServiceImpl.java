package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsNewsDao;
import com.yongyou.iSupport.entity.IsNews;
import com.yongyou.iSupport.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private IsNewsDao isNewsDao;

	@Override
	public int insert(IsNews record){
		return this.isNewsDao.insert(record);
	}

	@Override
	public List<IsNews> findList(IsNews news){
		return this.isNewsDao.findList(news);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkNews){
		return this.isNewsDao.deleteByPrimaryKey(pkNews);
	}
	
	@Override
	public IsNews selectByPrimaryKey(Integer pkNews){
		return this.isNewsDao.selectByPrimaryKey(pkNews);
	}
	
	@Override
	public int updateByPrimaryKey(IsNews record){
		return this.isNewsDao.updateByPrimaryKey(record);
	}
	
	@Override
	public int insertNews(IsNews news){
		return this.isNewsDao.insertNews(news);
	}
	
	@Override
	 public List<IsNews> findNewsByColumn(IsNews news){
		 return this.isNewsDao.findNewsByColumn(news);
	 }
	
	
	public List<IsNews> selectByPkColumn(Integer pkColumn){
		return this.isNewsDao.selectByPkColumn(pkColumn);
	}
	
}
