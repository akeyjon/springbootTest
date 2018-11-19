package com.cn.scala.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
public class UserController extends BaseController{

	private static final Log LOG = LogFactory.getLog(UserController.class);
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/toLogin/{id}",method=RequestMethod.GET)
	public String toLogin(@PathVariable int id){
//		List<Object> list = new ArrayList<>();
//		Map<String, Object> map =new HashMap<>();
		userService.addUser(id);
		
		return "system/index";
	}
	
	@RequestMapping(value="/toShowUser",method=RequestMethod.GET)
	public String getUserInfo(@RequestParam ("id") int id, Model model) throws Exception{
//		int userId = Integer.parseInt(id);
		User user = userService.findUser(id);
		model.addAttribute("user", user);
		LOG.info("请求用户数据");
		return "system/showUser";
	}
	
	@RequestMapping(value="/toGetUser",method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@RequestParam ("id") Integer id) {
//		int userId = Integer.parseInt(id);
		User user = null;
		String name = (String) getRequest().getParameter("name");
		System.out.println("name = "+ name);
        try {
            user = userService.findUser(id);
            System.out.println(name);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		return user;
	}
}
