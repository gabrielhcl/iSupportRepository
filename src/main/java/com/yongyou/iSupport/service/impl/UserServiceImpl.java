package com.yongyou.iSupport.service.impl;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.yongyou.iSupport.dao.UserDao;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}
	
	@Override
	public User selectByNameAndPwd(User user){
		return this.userDao.selectByNameAndPwd(user);
	}
	
	@Override
	public int insertUser(User user){
		return this.userDao.insertUser(user);
	}
}
