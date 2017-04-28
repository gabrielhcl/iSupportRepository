package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsComment;
import com.yongyou.iSupport.entity.IsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsCommentDao {
    int countByExample(IsCommentExample example);

    int deleteByExample(IsCommentExample example);

    int deleteByPrimaryKey(Integer pkComment);

    int insert(IsComment record);

    int insertSelective(IsComment record);

    List<IsComment> selectByExample(IsCommentExample example);

    IsComment selectByPrimaryKey(Integer pkComment);
    
    List<IsComment> selectByPkNews(Integer pkNews);

    int updateByExampleSelective(@Param("record") IsComment record, @Param("example") IsCommentExample example);

    int updateByExample(@Param("record") IsComment record, @Param("example") IsCommentExample example);

    int updateByPrimaryKeySelective(IsComment record);

    int updateByPrimaryKey(IsComment record);
    
    public List<IsComment> findList(IsComment comment);
}