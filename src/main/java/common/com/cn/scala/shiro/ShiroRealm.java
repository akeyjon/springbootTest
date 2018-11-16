package com.cn.scala.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cn.scala.mapper.UserMapper;
import com.cn.scala.model.User;
import com.cn.scala.service.UserService;

@Component
public class ShiroRealm extends AuthorizingRealm{

	@Autowired
	private UserMapper userMapper;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * 登录认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		User u = (User) token.getPrincipal();
		User user = userMapper.selectUserByName(u.getUserName());
		SimpleAuthenticationInfo simple = new SimpleAuthenticationInfo();
		return simple;
	}

}
