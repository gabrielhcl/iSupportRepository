package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBProduct;
import com.yongyou.iSupport.entity.IsBProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsBProductDao {

    int deleteByPrimaryKey(Integer pkProduct);

    int insert(IsBProduct record);

    IsBProduct selectByPrimaryKey(Integer pkProduct);

    int updateByPrimaryKey(IsBProduct record);
    
    List<IsBProduct> findList(IsBProduct record);
}