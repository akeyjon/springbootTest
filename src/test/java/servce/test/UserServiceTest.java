package servce.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cn.Application;
import com.cn.scala.model.User;
import com.cn.scala.service.UserService;

import test.BaseTest;

public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService userService;
	
	@Test
	public void testFind(){
		User user = new User();
		user.setId(1);
		User findUser = userService.login(user);
		System.out.println(findUser);
	}
}
