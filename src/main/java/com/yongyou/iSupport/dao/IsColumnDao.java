package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsColumn;
import com.yongyou.iSupport.entity.IsColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsColumnDao {
    int countByExample(IsColumnExample example);

    int deleteByExample(IsColumnExample example);

    int deleteByPrimaryKey(Integer pkColumn);

    int insert(IsColumn record);

    int insertSelective(IsColumn record);

    List<IsColumn> selectByExample(IsColumnExample example);

    IsColumn selectByPrimaryKey(Integer pkColumn);

    int updateByExampleSelective(@Param("record") IsColumn record, @Param("example") IsColumnExample example);

    int updateByExample(@Param("record") IsColumn record, @Param("example") IsColumnExample example);

    int updateByPrimaryKeySelective(IsColumn record);

    int updateByPrimaryKey(IsColumn record);
    
    public List<IsColumn> findList(IsColumn column);
}