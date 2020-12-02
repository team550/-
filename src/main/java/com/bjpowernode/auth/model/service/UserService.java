package com.bjpowernode.auth.model.service;

import com.bjpowernode.auth.entity.User;
import com.bjpowernode.auth.templete.ITempleteService;

import java.util.Map;


public interface UserService extends ITempleteService<User> {

    /**
     *@ClassName UserService
     *@Description 验证登录
     *@Author PowerNode
     *@Date 2020/12/1 19:28
     *@Version 1.0
     */
    User saveLogin(Map<String, Object> parasMap);

    /**
     *@ClassName UserService
     *@Description 根据id查员工
     *@Author PowerNode
     *@Date 2020/12/2 9:21
     *@Version 1.0
     */
    User queryUserById(Integer userId);
}
