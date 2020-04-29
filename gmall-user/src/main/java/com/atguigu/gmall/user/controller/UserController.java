package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getAllUser")
    //@ResponseBody
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userService.getAllUser();
        return umsMemberList;
    }

    @RequestMapping("getUserById")
    public UmsMember getUserById(String id) {
        UmsMember user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("removeUser")
    public String removeUser(String id) {
        String result = userService.removeUser(id);
        return result;
    }

    @RequestMapping("index")
    //@ResponseBody
    public String index() {
        return "this is a test. hello user!";
    }
}
