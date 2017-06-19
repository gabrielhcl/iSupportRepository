package com.yongyou.iSupport.service;

import java.util.List;

import com.yongyou.iSupport.entity.User;

public interface UserService {  
    public User getUserById(int userId);  
    
    public User selectByNameAndPwd(User user);
    
    public int insertUser(User user);
    
    public User selectByUserCode(String usercode);
    
    int updateByPrimaryKey(User record);
    
    List<User> findList(User user);
}  
