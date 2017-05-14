package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsSDweekplaneP;

public interface IsSDweekplanePService {

	int insert(IsSDweekplaneP record);
	
	int deleteByHeadKey(Integer pkDweekplaneH);
	
	List<IsSDweekplaneP> selectByHeadKey(Integer pkSDweekplaneN);
}
