package com.cn.scala.controller;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cn.scala.model.User;
import com.cn.scala.service.UserService;
import com.cn.scala.service.imp.UserServiceImp;
@Controller
@RequestMapping("/system")
public class UserController {

	private static final Log LOG = LogFactory.getLog(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/toLogin",method=RequestMethod.GET)
	public String toLogin(){
		
		return "system/index";
	}
	
	@RequestMapping(value="/toShowUser",method=RequestMethod.GET)
	public String getUserInfo(@RequestParam ("id") String id, Model model){
		int userId = Integer.parseInt(id);
		User user = userService.findUser(userId);
		model.addAttribute("user", user);
		LOG.info("请求用户数据");
		return "system/showUser";
	}
	
	@RequestMapping(value="/toGetUser",method=RequestMethod.GET)
	@ResponseBody
	public User getUser(String id){
		int userId = Integer.parseInt(id);
		User user = userService.findUser(userId);
		return user;
	}
}
