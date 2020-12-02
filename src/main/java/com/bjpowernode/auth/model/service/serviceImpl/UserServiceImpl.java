/**
 * @ClassName UserServiceImpl
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 18:22
 * @Version 1.0
 */
package com.bjpowernode.auth.model.service.serviceImpl;

import com.bjpowernode.auth.entity.User;
import com.bjpowernode.auth.model.mapper.UserMapper;
import com.bjpowernode.auth.model.service.UserService;
import com.bjpowernode.auth.templete.ITempleteDao;
import com.bjpowernode.auth.templete.TempleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl extends TempleteService<User> implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public ITempleteDao<User> getDao() {
        return userMapper;
    }

    /**
     *@ClassName UserServiceImpl
     *@Description 验证登录
     *@Author PowerNode
     *@Date 2020/12/1 19:28
     *@Version 1.0
     */
    @Override
    public User saveLogin(Map<String, Object> parasMap) {
        return userMapper.saveLogin(parasMap);
    }

    /**
     *@ClassName UserServiceImpl
     *@Description 根据id查员工
     *@Author PowerNode
     *@Date 2020/12/2 9:21
     *@Version 1.0
     */
    @Override
    public User queryUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}