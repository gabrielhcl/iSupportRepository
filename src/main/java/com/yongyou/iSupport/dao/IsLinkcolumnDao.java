package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsLinkcolumn;
import com.yongyou.iSupport.entity.IsLinkcolumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsLinkcolumnDao {

    int deleteByPrimaryKey(Integer pkColumn);

    int insert(IsLinkcolumn record);

    IsLinkcolumn selectByPrimaryKey(Integer pkColumn);

    int updateByPrimaryKey(IsLinkcolumn record);
    
    List<IsLinkcolumn> findList(IsLinkcolumn record);
}