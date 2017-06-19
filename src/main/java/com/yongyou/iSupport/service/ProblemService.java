package com.yongyou.iSupport.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yongyou.iSupport.entity.IsProblem;
import com.yongyou.iSupport.entity.IsProblemExample;

public interface ProblemService {


    int deleteByPrimaryKey(Integer pkProblem);

    int insert(IsProblem record);


    IsProblem selectByPrimaryKey(Integer pkProblem);

    List<IsProblem> findList(IsProblem record);

    int updateByPrimaryKey(IsProblem record);
}
