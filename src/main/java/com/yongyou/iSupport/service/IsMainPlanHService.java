package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsMainplanH;

public interface IsMainPlanHService {
	int insert(IsMainplanH record);
	
	public List<IsMainplanH> findList(IsMainplanH mainplanh);
	
	int deleteByPrimaryKey(Integer pkMainplanH);
	
	IsMainplanH selectByPrimaryKey(Integer pkMainplanH);
	
	IsMainplanH selectByProjectName(String projectname);
}
