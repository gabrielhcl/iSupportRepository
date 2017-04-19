package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsSDweekplaneH;
import com.yongyou.iSupport.entity.IsSDweekplaneHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsSDweekplaneHDao {
    int countByExample(IsSDweekplaneHExample example);

    int deleteByExample(IsSDweekplaneHExample example);

    int deleteByPrimaryKey(Integer pkDweekplaneH);

    int insert(IsSDweekplaneH record);

    int insertSelective(IsSDweekplaneH record);

    List<IsSDweekplaneH> selectByExample(IsSDweekplaneHExample example);

    IsSDweekplaneH selectByPrimaryKey(Integer pkDweekplaneH);

    int updateByExampleSelective(@Param("record") IsSDweekplaneH record, @Param("example") IsSDweekplaneHExample example);

    int updateByExample(@Param("record") IsSDweekplaneH record, @Param("example") IsSDweekplaneHExample example);

    int updateByPrimaryKeySelective(IsSDweekplaneH record);

    int updateByPrimaryKey(IsSDweekplaneH record);
}