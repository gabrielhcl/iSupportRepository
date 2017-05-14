package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsSDweekplaneN;

public interface IsSDweekplaneNService {
	
	int insert(IsSDweekplaneN record);
	
	int deleteByHeadKey(Integer pkDweekplaneH);
	
	List<IsSDweekplaneN> selectByHeadKey(Integer pkSDweekplaneN);
}
