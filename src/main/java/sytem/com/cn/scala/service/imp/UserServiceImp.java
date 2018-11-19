package com.cn.scala.service.imp;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Service;

import com.cn.scala.anotion.BusesAnotion;
import com.cn.scala.cache.CacheContext;
import com.cn.scala.mapper.UserMapper;
import com.cn.scala.model.User;
import com.cn.scala.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService{

    @Resource
    private CacheContext<User> cacheContext;
    
    @Autowired
    private ConcurrentMapCacheManager cacheManager;
    
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
//	@BusesAnotion(action="查找用户")
	@Cacheable(cacheNames="userCache")
	public User findUser(int id) throws Exception{
//	    User cacheu = (User) cacheContext.getCachefromid(id);
//	    if(cacheu != null){
//	        return cacheu;
//	    }
		User user = userMapper.selectByPrimaryKey(id);
//		cacheContext.setCache(id, user);
		return user;
	}

	@CachePut(cacheNames="userCache", key="#id")
	public User addUser(int id){
	    User user = new User();
	    user.setId(id);
	    user.setAge(10);
	    user.setUserName("小王");
	    return user;
	}
	

}
