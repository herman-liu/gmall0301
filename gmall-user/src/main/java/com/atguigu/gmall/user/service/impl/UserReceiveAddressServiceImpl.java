package com.atguigu.gmall.user.service.impl;

import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserReceiveAddressMapper;
import com.atguigu.gmall.service.UserReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
