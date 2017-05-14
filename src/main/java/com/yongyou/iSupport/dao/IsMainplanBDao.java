package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsMainplanB;
import com.yongyou.iSupport.entity.IsMainplanBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsMainplanBDao {
    int countByExample(IsMainplanBExample example);

    int deleteByExample(IsMainplanBExample example);

    int deleteByPrimaryKey(Integer pkMainplanB);
    
    int deleteByMainplanId(Integer pkMainPlanH);

    int insert(IsMainplanB record);

    int insertSelective(IsMainplanB record);

    List<IsMainplanB> selectByExample(IsMainplanBExample example);

    IsMainplanB selectByPrimaryKey(Integer pkMainplanB);

    int updateByExampleSelective(@Param("record") IsMainplanB record, @Param("example") IsMainplanBExample example);

    int updateByExample(@Param("record") IsMainplanB record, @Param("example") IsMainplanBExample example);

    int updateByPrimaryKeySelective(IsMainplanB record);

    int updateByPrimaryKey(IsMainplanB record);
    
    IsMainplanB selectByMainplanHAndPlancode(@Param("pkMainplanH")Integer pkMainplanH,@Param("plancode")String plancode);
}