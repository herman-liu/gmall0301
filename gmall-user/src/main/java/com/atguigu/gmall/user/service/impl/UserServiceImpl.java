package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> list = userMapper.selectAllUser();
        return list;
    }

    @Override
    public UmsMember getUserById(String id) {
        UmsMember umsMember = new UmsMember();
        umsMember.setId(id);
        List<UmsMember> umsMembers = userMapper.select(umsMember);
        if (umsMembers == null)
            return null;
        return umsMembers.get(0);
    }

    @Override
    public String removeUser(String id) {
        UmsMember user = getUserById(id);
        if (user == null)
            return "No such user!";
        try {
            userMapper.delete(user);
        }catch (Exception e) {
            return "Error!";
        }
        return "Successfully removed!";
    }
}
