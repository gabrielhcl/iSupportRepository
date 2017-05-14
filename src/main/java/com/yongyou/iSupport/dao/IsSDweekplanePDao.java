package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsSDweekplaneP;
import com.yongyou.iSupport.entity.IsSDweekplanePExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsSDweekplanePDao {
    int countByExample(IsSDweekplanePExample example);

    int deleteByExample(IsSDweekplanePExample example);

    int deleteByPrimaryKey(Integer pkSDweekplaneP);
    
    int deleteByHeadKey(Integer pkDweekplaneH);

    int insert(IsSDweekplaneP record);

    int insertSelective(IsSDweekplaneP record);

    List<IsSDweekplaneP> selectByExample(IsSDweekplanePExample example);

    IsSDweekplaneP selectByPrimaryKey(Integer pkSDweekplaneP);
    
    List<IsSDweekplaneP> selectByHeadKey(Integer pkSDweekplaneN);

    int updateByExampleSelective(@Param("record") IsSDweekplaneP record, @Param("example") IsSDweekplanePExample example);

    int updateByExample(@Param("record") IsSDweekplaneP record, @Param("example") IsSDweekplanePExample example);

    int updateByPrimaryKeySelective(IsSDweekplaneP record);

    int updateByPrimaryKey(IsSDweekplaneP record);
}