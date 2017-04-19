package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsSDweekplaneN;
import com.yongyou.iSupport.entity.IsSDweekplaneNExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsSDweekplaneNDao {
    int countByExample(IsSDweekplaneNExample example);

    int deleteByExample(IsSDweekplaneNExample example);

    int deleteByPrimaryKey(Integer pkSDweekplaneN);

    int insert(IsSDweekplaneN record);

    int insertSelective(IsSDweekplaneN record);

    List<IsSDweekplaneN> selectByExample(IsSDweekplaneNExample example);

    IsSDweekplaneN selectByPrimaryKey(Integer pkSDweekplaneN);

    int updateByExampleSelective(@Param("record") IsSDweekplaneN record, @Param("example") IsSDweekplaneNExample example);

    int updateByExample(@Param("record") IsSDweekplaneN record, @Param("example") IsSDweekplaneNExample example);

    int updateByPrimaryKeySelective(IsSDweekplaneN record);

    int updateByPrimaryKey(IsSDweekplaneN record);
}