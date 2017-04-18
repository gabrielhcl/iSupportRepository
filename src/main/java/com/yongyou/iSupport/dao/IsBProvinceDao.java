package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBProvince;
import com.yongyou.iSupport.entity.IsBProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsBProvinceDao {
    int countByExample(IsBProvinceExample example);

    int deleteByExample(IsBProvinceExample example);

    int deleteByPrimaryKey(Integer pkProvince);

    int insert(IsBProvince record);

    int insertSelective(IsBProvince record);

    List<IsBProvince> selectByExample(IsBProvinceExample example);

    IsBProvince selectByPrimaryKey(Integer pkProvince);

    int updateByExampleSelective(@Param("record") IsBProvince record, @Param("example") IsBProvinceExample example);

    int updateByExample(@Param("record") IsBProvince record, @Param("example") IsBProvinceExample example);

    int updateByPrimaryKeySelective(IsBProvince record);

    int updateByPrimaryKey(IsBProvince record);
}