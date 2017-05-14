package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.IsLinkcolumn;

public interface LinkColumnService {

	 int deleteByPrimaryKey(Integer pkColumn);

	    int insert(IsLinkcolumn record);

	    IsLinkcolumn selectByPrimaryKey(Integer pkColumn);

	    int updateByPrimaryKey(IsLinkcolumn record);
	    
	    List<IsLinkcolumn> findList(IsLinkcolumn record);
}
