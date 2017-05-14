package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBShanxi;
import com.yongyou.iSupport.entity.IsBShanxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsBShanxiDao {
    int countByExample(IsBShanxiExample example);

    int deleteByExample(IsBShanxiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IsBShanxi record);

    int insertSelective(IsBShanxi record);

    List<IsBShanxi> selectByExample(IsBShanxiExample example);

    IsBShanxi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IsBShanxi record, @Param("example") IsBShanxiExample example);

    int updateByExample(@Param("record") IsBShanxi record, @Param("example") IsBShanxiExample example);

    int updateByPrimaryKeySelective(IsBShanxi record);

    int updateByPrimaryKey(IsBShanxi record);
    
    List<IsBShanxi> findList(IsBShanxi record);
}