package com.yongyou.iSupport.service;

import java.util.List;

import org.springframework.ui.Model;

import com.yongyou.iSupport.entity.IsSDweekplaneH;

public interface IsSDweekplaneHService {

	int insert(IsSDweekplaneH record);
	
	public List<IsSDweekplaneH> findList(IsSDweekplaneH record);
	
	int deleteByPrimaryKey(Integer pkDweekplaneH);


	IsSDweekplaneH deleteDWeekPlane(Integer pkDweekplaneH, IsSDweekplaneH isSDweekplaneH);


	IsSDweekplaneH selectdweekplanedetail(Integer pkDweekplaneH, IsSDweekplaneH isSDweekplaneH, Model model);
}
