package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsLink;
import com.yongyou.iSupport.entity.IsLinkExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsLinkDao {
    int countByExample(IsLinkExample example);

    int deleteByExample(IsLinkExample example);

    int deleteByPrimaryKey(Integer pkLink);

    int insert(IsLink record);

    int insertSelective(IsLink record);

    List<IsLink> selectByExample(IsLinkExample example);

    IsLink selectByPrimaryKey(Integer pkLink);

    int updateByExampleSelective(@Param("record") IsLink record, @Param("example") IsLinkExample example);

    int updateByExample(@Param("record") IsLink record, @Param("example") IsLinkExample example);

    int updateByPrimaryKeySelective(IsLink record);

    int updateByPrimaryKey(IsLink record);
    
    public List<IsLink> findList(IsLink link);
}