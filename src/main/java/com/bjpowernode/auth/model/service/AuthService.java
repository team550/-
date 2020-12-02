package com.bjpowernode.auth.model.service;

import com.bjpowernode.auth.entity.Auth;
import com.bjpowernode.auth.templete.ITempleteService;

public interface AuthService extends ITempleteService<Auth> {
    /**
     *@ClassName AuthService
     *@Description 根据authId查找权限
     *@Author PowerNode
     *@Date 2020/12/2 10:22
     *@Version 1.0
     */
    Auth queryAuthById(Integer authId);
}
