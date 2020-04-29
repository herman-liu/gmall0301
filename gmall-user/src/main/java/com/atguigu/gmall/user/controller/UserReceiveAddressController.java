package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserReceiveAddressService;
import com.atguigu.gmall.service.UserReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserReceiveAddressController {

    @Autowired
    UserReceiveAddressService userReceiveAddressService;

    @RequestMapping("getAllReceiveAddresses")
    public List<UmsMemberReceiveAddress> getAllReceiveAddresses(String memberId) {
        List<UmsMemberReceiveAddress> receiveAddresses = userReceiveAddressService.getAllReceiveAddresses(memberId);
        return receiveAddresses;
    }

}
