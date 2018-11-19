package test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.scala.service.UserService;

public class CacheTest extends BaseTest{
    
    @Autowired
    private UserService userService;

    @Test
    public void test1() throws Exception{
        userService.findUser(1);
    }
}
