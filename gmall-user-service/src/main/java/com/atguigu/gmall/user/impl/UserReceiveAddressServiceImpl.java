package com.atguigu.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserReceiveAddressService;
import com.atguigu.gmall.user.mapper.UserReceiveAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserReceiveAddressServiceImpl implements UserReceiveAddressService {

    @Autowired
    UserReceiveAddressMapper userReceiveAddressMapper;

    @Override
    public List<UmsMemberReceiveAddress> getAllReceiveAddresses(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", memberId);

        List<UmsMemberReceiveAddress> list = userReceiveAddressMapper.selectByExample(e);
        return list;
    }
}
