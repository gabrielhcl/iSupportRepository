package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsMainplanHDao;
import com.yongyou.iSupport.entity.IsMainplanH;
import com.yongyou.iSupport.service.IsMainPlanHService;

@Service("isMainPlanHService")
public class IsMainPlanHServiceImpl implements IsMainPlanHService {

	@Autowired
	private IsMainplanHDao isMainPlanHDao;
	
	@Override
	public int insert(IsMainplanH record) {
		// TODO Auto-generated method stub
		return this.isMainPlanHDao.insert(record);
	}
	
	@Override
	public List<IsMainplanH> findList(IsMainplanH mainplanh){
		return this.isMainPlanHDao.findList(mainplanh);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkMainplanH){
		return this.isMainPlanHDao.deleteByPrimaryKey(pkMainplanH);
	}

	@Override
	public IsMainplanH selectByPrimaryKey(Integer pkMainplanH){
		return this.isMainPlanHDao.selectByPrimaryKey(pkMainplanH);
	}
	
	@Override
	public IsMainplanH selectByProjectName(String projectname){
		return this.isMainPlanHDao.selectByProjectName(projectname);
	}
	
	@Override
	public int updateByPrimaryKey(IsMainplanH record){
		return this.isMainPlanHDao.updateByPrimaryKey(record);
	}
}
