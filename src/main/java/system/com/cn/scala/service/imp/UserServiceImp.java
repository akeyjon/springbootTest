package com.cn.scala.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.scala.mapper.UserMapper;
import com.cn.scala.model.User;
import com.cn.scala.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public Boolean regist(User user) {
		// TODO Auto-generated method stub
		
		int insert = userMapper.insert(user);
		return insert > 0 ? true:false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(user.getId());
		return selectByPrimaryKey;
	}

	@Override
	public User findUser(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

}
