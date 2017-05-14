package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsBProject;

public interface IsBProjectService  {

	int insert(IsBProject record);
	
	public List<IsBProject> findList(IsBProject record);
	
	int deleteByPrimaryKey(Integer pkProject);
	
	IsBProject selectByPrimaryKey(Integer pkProject);
	
	int updateByPrimaryKey(IsBProject record);
	
	IsBProject selectByProjectName(String projectname);
}
