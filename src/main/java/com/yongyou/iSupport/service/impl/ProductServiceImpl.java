package com.yongyou.iSupport.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsBProductDao;
import com.yongyou.iSupport.entity.IsBProduct;
import com.yongyou.iSupport.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private IsBProductDao productDao;
	
	@Override
	public int insert(IsBProduct record) {
		// TODO Auto-generated method stub
		return this.productDao.insert(record);
	}



	@Override
	public IsBProduct selectByPrimaryKey(Integer pkProduct) {
		// TODO Auto-generated method stub
		return this.productDao.selectByPrimaryKey(pkProduct);
	}



	@Override
	public int updateByPrimaryKey(IsBProduct record) {
		// TODO Auto-generated method stub
		return this.productDao.updateByPrimaryKey(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer pkProduct){
		return this.productDao.deleteByPrimaryKey(pkProduct);
	}
	
	@Override
	public  List<IsBProduct> findList(IsBProduct record){
		return this.productDao.findList(record);
	}
}
