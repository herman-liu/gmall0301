package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserReceiveAddressService {

    List<UmsMemberReceiveAddress> getAllReceiveAddresses(String memberId);
}
