package com.cn.scala.shiro;

import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
	
	@Bean
	public DefaultWebSecurityManager securityManager(ShiroRealm shiroRealm){
		
		DefaultWebSecurityManager securityManager  = new DefaultWebSecurityManager();
		securityManager.setRealm(shiroRealm);
		return securityManager;
	}
}
