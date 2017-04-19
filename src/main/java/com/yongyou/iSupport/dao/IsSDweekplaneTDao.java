package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.entity.IsSDweekplaneTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsSDweekplaneTDao {
    int countByExample(IsSDweekplaneTExample example);

    int deleteByExample(IsSDweekplaneTExample example);

    int deleteByPrimaryKey(Integer pkSDweekplaneT);

    int insert(IsSDweekplaneT record);

    int insertSelective(IsSDweekplaneT record);

    List<IsSDweekplaneT> selectByExample(IsSDweekplaneTExample example);

    IsSDweekplaneT selectByPrimaryKey(Integer pkSDweekplaneT);

    int updateByExampleSelective(@Param("record") IsSDweekplaneT record, @Param("example") IsSDweekplaneTExample example);

    int updateByExample(@Param("record") IsSDweekplaneT record, @Param("example") IsSDweekplaneTExample example);

    int updateByPrimaryKeySelective(IsSDweekplaneT record);

    int updateByPrimaryKey(IsSDweekplaneT record);
}