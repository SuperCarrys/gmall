package com.sizheng.gmall.service;

import com.sizheng.gmall.bean.UmsMember;
import com.sizheng.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    void addUserToken(String token, String memberId);

    UmsMember login(UmsMember umsMember);

    UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId);
}
