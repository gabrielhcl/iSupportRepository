package com.yongyou.iSupport.service;

import com.yongyou.iSupport.entity.User;

public interface UserService {  
    public User getUserById(int userId);  
    
    public User selectByNameAndPwd(User user);
    
    public int insertUser(User user);
}  
