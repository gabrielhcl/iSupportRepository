package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsProblem;
import java.util.List;

public interface IsProblemDao {

    int deleteByPrimaryKey(Integer pkProblem);

    int insert(IsProblem record);

    IsProblem selectByPrimaryKey(Integer pkProblem);

    int updateByPrimaryKey(IsProblem record);
    
    List<IsProblem> findList(IsProblem record);
}