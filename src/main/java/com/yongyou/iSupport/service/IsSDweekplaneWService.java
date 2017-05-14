package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.entity.IsSDweekplaneW;

public interface IsSDweekplaneWService {

	int insert(IsSDweekplaneW record);
	
	int deleteByHeadKey(Integer pkDweekplaneH);
	
	List<IsSDweekplaneT> selectByHeadKey(Integer pkSDweekplaneN);
}
