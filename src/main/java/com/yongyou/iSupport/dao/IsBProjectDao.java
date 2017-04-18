package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.entity.IsBProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IsBProjectDao {
	 int countByExample(IsBProjectExample example);

	    int deleteByExample(IsBProjectExample example);

	    int deleteByPrimaryKey(Integer pkProject);

	    int insert(IsBProject record);

	    int insertSelective(IsBProject record);

	    List<IsBProject> selectByExample(IsBProjectExample example);

	    IsBProject selectByPrimaryKey(Integer pkProject);

	    int updateByExampleSelective(@Param("record") IsBProject record, @Param("example") IsBProjectExample example);

	    int updateByExample(@Param("record") IsBProject record, @Param("example") IsBProjectExample example);

	    int updateByPrimaryKeySelective(IsBProject record);

	    int updateByPrimaryKey(IsBProject record);
	    
	    public List<IsBProject> findList(IsBProject record);
}