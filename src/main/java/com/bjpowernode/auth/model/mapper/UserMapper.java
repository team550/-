package com.bjpowernode.auth.model.mapper;

import com.bjpowernode.auth.entity.User;
import com.bjpowernode.auth.templete.ITempleteDao;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserMapper extends ITempleteDao<User> {


    /**
     *@ClassName UserMapper
     *@Description 验证登录
     *@Author PowerNode
     *@Date 2020/12/1 19:15
     *@Version 1.0
     */
    User saveLogin(Map<String, Object> parasMap);
}