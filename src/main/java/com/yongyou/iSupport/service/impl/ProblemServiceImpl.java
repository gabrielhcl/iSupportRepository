package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsProblemDao;
import com.yongyou.iSupport.entity.IsProblem;
import com.yongyou.iSupport.service.ProblemService;


@Service("problemService")
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	private IsProblemDao isProblemDao;
	

	@Override
	public int deleteByPrimaryKey(Integer pkProblem) {
		// TODO Auto-generated method stub
		return this.isProblemDao.deleteByPrimaryKey(pkProblem);
	}

	@Override
	public int insert(IsProblem record) {
		// TODO Auto-generated method stub
		return this.isProblemDao.insert(record);
	}


	@Override
	public IsProblem selectByPrimaryKey(Integer pkProblem) {
		// TODO Auto-generated method stub
		return this.isProblemDao.selectByPrimaryKey(pkProblem);
	}


	@Override
	public int updateByPrimaryKey(IsProblem record) {
		// TODO Auto-generated method stub
		return this.isProblemDao.updateByPrimaryKey(record);
	}

	
	@Override
	public List<IsProblem> findList(IsProblem record){
		return this.isProblemDao.findList(record);
	}
}
