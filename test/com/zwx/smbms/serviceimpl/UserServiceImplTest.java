package com.zwx.smbms.serviceimpl;

import com.zwx.smbms.pojo.User;
import com.zwx.smbms.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    private UserService userService;
    @Before
    public void setUp() throws Exception {
        userService=new UserServiceImpl();
    }

    @Test
    public void testadd() throws Exception {
        boolean result=false;
        User user=new User();
        user.setUserCode("jackson");
        user.setUserName("王嘉尔");
        user.setUserPassword("000000");
        result=userService.add(user);
        System.out.println(result);
        Assert.assertTrue("增加失败",result);
    }

    @Test
    public void testUserListSearch() throws Exception {
        int result=2;
        List<User> userlist=null;
        userlist=userService.getUserList("");
        Assert.assertEquals(result,userlist.size());
    }

    @Test
    public void testGetUserByUserName() throws Exception{
        String name1="王嘉尔";
        String name2="韩";
        String name3="韩云溪";
        User user=userService.getUserByUserName(name3);
        Assert.assertNotNull("查找失败",user);
    }


}