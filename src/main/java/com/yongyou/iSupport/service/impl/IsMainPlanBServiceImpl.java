package com.yongyou.iSupport.service.impl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsMainplanBDao;
import com.yongyou.iSupport.entity.IsMainplanB;
import com.yongyou.iSupport.service.IsMainPlanBService;

@Service("isMainPlanBService")
public class IsMainPlanBServiceImpl implements IsMainPlanBService {

	@Autowired
	private IsMainplanBDao isMainplanBDao;
	
	@Override
	public int insert(IsMainplanB record) {
		// TODO Auto-generated method stub
		return this.isMainplanBDao.insert(record);
	}

	@Override
	public int deleteByMainplanId(Integer pkMainPlanH){
		return this.isMainplanBDao.deleteByMainplanId(pkMainPlanH);
	}
	
	@Override
	public IsMainplanB selectByMainplanHAndPlancode(@Param("pkMainplanH")Integer pkMainplanH,@Param("plancode")String plancode){
		return this.isMainplanBDao.selectByMainplanHAndPlancode(pkMainplanH, plancode);
	}
	
	@Override
    public	int updateByMainplanH(IsMainplanB record){
		 return this.isMainplanBDao.updateByMainplanH(record);
	 }
}
