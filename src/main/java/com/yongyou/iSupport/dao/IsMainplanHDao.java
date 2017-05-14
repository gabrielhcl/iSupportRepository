package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsMainplanH;
import com.yongyou.iSupport.entity.IsMainplanHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsMainplanHDao {
    int countByExample(IsMainplanHExample example);

    int deleteByExample(IsMainplanHExample example);

    int deleteByPrimaryKey(Integer pkMainplanH);

    int insert(IsMainplanH record);

    int insertSelective(IsMainplanH record);

    List<IsMainplanH> selectByExample(IsMainplanHExample example);

    IsMainplanH selectByPrimaryKey(Integer pkMainplanH);

    int updateByExampleSelective(@Param("record") IsMainplanH record, @Param("example") IsMainplanHExample example);

    int updateByExample(@Param("record") IsMainplanH record, @Param("example") IsMainplanHExample example);

    int updateByPrimaryKeySelective(IsMainplanH record);

    int updateByPrimaryKey(IsMainplanH record);
    
    public List<IsMainplanH> findList(IsMainplanH mainplanh);
    
    IsMainplanH selectByProjectName(String projectname);
}