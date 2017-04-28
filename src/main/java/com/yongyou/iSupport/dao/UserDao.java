package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.User;

public interface UserDao {
	int deleteByPrimaryKey(Integer id);
    public int insertUser(User user);

    int insertSelective(User record);

    public User selectByPrimaryKey(Integer id);

    public User selectByUserCode(String usercode);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    public User selectByNameAndPwd(User user);
    
}
