package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsNews;
import com.yongyou.iSupport.entity.IsNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsNewsDao {
    int countByExample(IsNewsExample example);

    public List<IsNews> findList(IsNews news);
    
    public List<IsNews> selectByPkColumn(Integer pkColumn);
    
    public List<IsNews> findNewsByColumn(IsNews news);
    
    int deleteByExample(IsNewsExample example);

    int deleteByPrimaryKey(Integer pkNews);

    int insert(IsNews record);

    int insertSelective(IsNews record);

    List<IsNews> selectByExample(IsNewsExample example);

    IsNews selectByPrimaryKey(Integer pkNews);

    int updateByExampleSelective(@Param("record") IsNews record, @Param("example") IsNewsExample example);

    int updateByExample(@Param("record") IsNews record, @Param("example") IsNewsExample example);

    int updateByPrimaryKeySelective(IsNews record);

    int updateByPrimaryKey(IsNews record);
    
    public int insertNews(IsNews news);
}