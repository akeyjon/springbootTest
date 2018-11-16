package test;

import java.net.PasswordAuthentication;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

import com.cn.scala.mapper.UserMapper;

public class ShiroTest {
	
//	SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();
//
//	@Before
//	public void  addUser(){
//		simpleAccountRealm.addAccount("dlw", "123", "role");
//	}
//	@Test
//	public void testAuthentication(){
//		//创建 securityManager 环境
//		
//		DefaultSecurityManager d = new DefaultSecurityManager();
//		d.setRealm(simpleAccountRealm);
//		//2 主体提交认证
//		SecurityUtils.setSecurityManager(d);
//		Subject subject = SecurityUtils.getSubject();
//		//认值数据
//		UsernamePasswordToken token = new UsernamePasswordToken("dlw", "123");
//		subject.login(token);
//		subject.checkRole("role");
//		subject.isAuthenticated();
//		
//		System.out.println("isAuthenticated = "+ subject.isAuthenticated());
//	}
}
