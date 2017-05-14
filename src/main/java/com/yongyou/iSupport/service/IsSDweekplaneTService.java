package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsSDweekplaneT;

public interface IsSDweekplaneTService {
	
	int insert(IsSDweekplaneT record);
	
	int deleteByHeadKey(Integer pkDweekplaneH);
	
	List<IsSDweekplaneT> selectByHeadKey(Integer pkSDweekplaneN);
}
