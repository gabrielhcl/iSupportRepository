package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBGroup;
import java.util.List;

public interface IsBGroupDao {

    public int deleteByPrimaryKey(Integer pk_group);

    public int insert(IsBGroup record);

    public IsBGroup selectByPrimaryKey(Integer pk_group);

    public int updateByPrimaryKey(IsBGroup record);
    
    public List<IsBGroup> findList(IsBGroup record);
    
    IsBGroup selectByCode(String groupcode);
}