package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBCorp;
import java.util.List;

public interface IsBCorpDao {


	public List<IsBCorp> findList(IsBCorp corp);
	
    public int deleteByPrimaryKey(Integer pkCorp);

    public int insert(IsBCorp record);

    public IsBCorp selectByPrimaryKey(Integer pkCorp);

    public int updateByPrimaryKey(IsBCorp record);
}