package com.cn.scala.service;

import com.cn.scala.anotion.BusesAnotion;
import com.cn.scala.model.User;

public interface UserService {

	//用户注册
	public Boolean regist(User user);
	
	//用户登陆
	public User login(User user);
	
	
	public User findUser(int id) throws Exception;
}
