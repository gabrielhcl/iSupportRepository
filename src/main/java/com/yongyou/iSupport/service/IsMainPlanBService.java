package com.yongyou.iSupport.service;

import org.apache.ibatis.annotations.Param;

import com.yongyou.iSupport.entity.IsMainplanB;

public interface IsMainPlanBService {
	
	int insert(IsMainplanB record);
	
	int deleteByMainplanId(Integer pkMainPlanH);
	
	IsMainplanB selectByMainplanHAndPlancode(@Param("pkMainplanH")Integer pkMainplanH,@Param("plancode")String plancode);

	int updateByMainplanH(IsMainplanB record);
}
