package com.cn.scala.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.scala.anotion.BusesAnotion;
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
	@BusesAnotion(action="查找用户")
	public User findUser(int id) throws Exception{
		User user = userMapper.selectByPrimaryKey(id);
//		String i = "dsfs";
//		Integer.parseInt(i);
		return user;
	}

}
