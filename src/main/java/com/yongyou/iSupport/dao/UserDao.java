package com.yongyou.iSupport.dao;

import com.yongyou.iSupport.entity.User;

public interface UserDao {
	int deleteByPrimaryKey(Integer id);
// �����û�
    public int insertUser(User user);

    int insertSelective(User record);

    public User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
//    �����û��������������û�
    public User selectByNameAndPwd(User user);
    
}
