package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsBProduct;

public interface ProductService {

	    int deleteByPrimaryKey(Integer pkProduct);

	    int insert(IsBProduct record);

	    IsBProduct selectByPrimaryKey(Integer pkProduct);

	    int updateByPrimaryKey(IsBProduct record);
	    
	    List<IsBProduct> findList(IsBProduct record);
}
