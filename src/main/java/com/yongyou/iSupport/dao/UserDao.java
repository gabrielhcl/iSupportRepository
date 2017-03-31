package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.User;

public interface UserDao {
	int deleteByPrimaryKey(Integer id);
// 插入用户
    public int insertUser(User user);

    int insertSelective(User record);

    public User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
//    根据用户名和密码搜索用户
    public User selectByNameAndPwd(User user);
    
}
