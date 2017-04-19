package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsSDweekplaneW;
import com.yongyou.iSupport.entity.IsSDweekplaneWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsSDweekplaneWDao {
    int countByExample(IsSDweekplaneWExample example);

    int deleteByExample(IsSDweekplaneWExample example);

    int deleteByPrimaryKey(Integer pkSDweekplaneW);

    int insert(IsSDweekplaneW record);

    int insertSelective(IsSDweekplaneW record);

    List<IsSDweekplaneW> selectByExample(IsSDweekplaneWExample example);

    IsSDweekplaneW selectByPrimaryKey(Integer pkSDweekplaneW);

    int updateByExampleSelective(@Param("record") IsSDweekplaneW record, @Param("example") IsSDweekplaneWExample example);

    int updateByExample(@Param("record") IsSDweekplaneW record, @Param("example") IsSDweekplaneWExample example);

    int updateByPrimaryKeySelective(IsSDweekplaneW record);

    int updateByPrimaryKey(IsSDweekplaneW record);
}