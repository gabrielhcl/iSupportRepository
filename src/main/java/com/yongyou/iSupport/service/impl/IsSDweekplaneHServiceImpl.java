package com.yongyou.iSupport.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.yongyou.iSupport.dao.IsSDweekplaneHDao;
import com.yongyou.iSupport.dao.IsSDweekplaneNDao;
import com.yongyou.iSupport.dao.IsSDweekplanePDao;
import com.yongyou.iSupport.dao.IsSDweekplaneTDao;
import com.yongyou.iSupport.dao.IsSDweekplaneWDao;
import com.yongyou.iSupport.entity.IsSDweekplaneH;
import com.yongyou.iSupport.entity.IsSDweekplaneN;
import com.yongyou.iSupport.entity.IsSDweekplaneP;
import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.service.IsSDweekplaneHService;

@Service("isSDweekplaneHService")
public class IsSDweekplaneHServiceImpl implements IsSDweekplaneHService{
	
	@Autowired
	private IsSDweekplaneHDao  isSDweekplaneHDao;

	@Autowired
	private IsSDweekplaneNDao isSDweekplaneNDao; 
	
	@Autowired
	private IsSDweekplanePDao isSDweekplanePDao;
	
	@Autowired
	private IsSDweekplaneTDao  isSDweekplaneTDao;
	
	@Autowired
	private IsSDweekplaneWDao isSDweekplaneWDao; 
	
	@Override
	public int insert(IsSDweekplaneH record){
		return this.isSDweekplaneHDao.insert(record);
	}
	
	@Override
	public List<IsSDweekplaneH> findList(IsSDweekplaneH record){
		return this.isSDweekplaneHDao.findList(record);
	}
	
	@Override
	public int deleteByPrimaryKey(Integer pkDweekplaneH){
		return this.isSDweekplaneHDao.deleteByPrimaryKey(pkDweekplaneH);
	}
	
	@Override
	public IsSDweekplaneH deleteDWeekPlane(Integer pkDweekplaneH,IsSDweekplaneH isSDweekplaneH){
		isSDweekplaneHDao.deleteByPrimaryKey(pkDweekplaneH);
		isSDweekplaneNDao.deleteByHeadKey(pkDweekplaneH);
		isSDweekplanePDao.deleteByHeadKey(pkDweekplaneH);
		isSDweekplaneTDao.deleteByHeadKey(pkDweekplaneH);
		isSDweekplaneWDao.deleteByHeadKey(pkDweekplaneH);
		return isSDweekplaneH;
	}
	
	@Override
	public IsSDweekplaneH selectdweekplanedetail(Integer pkDweekplaneH,IsSDweekplaneH isSDweekplaneH,Model model){
		IsSDweekplaneH isSDweekplaneH2 = isSDweekplaneHDao.selectByPrimaryKey(pkDweekplaneH);
		List<IsSDweekplaneN> nlist = isSDweekplaneNDao.selectByHeadKey(pkDweekplaneH);
		List<IsSDweekplaneP> plist = isSDweekplanePDao.selectByHeadKey(pkDweekplaneH);
		List<IsSDweekplaneT> tlist = isSDweekplaneTDao.selectByHeadKey(pkDweekplaneH);
		List<IsSDweekplaneT> wlist = isSDweekplaneWDao.selectByHeadKey(pkDweekplaneH);
		model.addAttribute("dweekplaneh",isSDweekplaneH2);
		model.addAttribute("nlist",nlist);
		model.addAttribute("plist",plist);
		model.addAttribute("tlist",tlist);
		model.addAttribute("wlist",wlist);
		return isSDweekplaneH;
	}
}
