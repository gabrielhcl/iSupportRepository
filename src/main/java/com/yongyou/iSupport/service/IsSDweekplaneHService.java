package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsSDweekplaneH;

public interface IsSDweekplaneHService {

	int insert(IsSDweekplaneH record);
	
	public List<IsSDweekplaneH> findList(IsSDweekplaneH record);
}
