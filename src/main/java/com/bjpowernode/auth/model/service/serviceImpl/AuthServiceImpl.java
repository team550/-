/**
 * @ClassName AuthServiceImpl
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 20:48
 * @Version 1.0
 */
package com.bjpowernode.auth.model.service.serviceImpl;

import com.bjpowernode.auth.entity.Auth;
import com.bjpowernode.auth.model.mapper.AuthMapper;
import com.bjpowernode.auth.model.service.AuthService;
import com.bjpowernode.auth.templete.ITempleteDao;
import com.bjpowernode.auth.templete.TempleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl extends TempleteService<Auth> implements AuthService {

    @Autowired
    AuthMapper authMapper;
    /**
     *@ClassName AuthServiceImpl
     *@Description 钩子
     *@Author PowerNode
     *@Date 2020/12/1 20:50
     *@Version 1.0
     */
    @Override
    public ITempleteDao<Auth> getDao() {
        return authMapper;
    }

    /**
     *@ClassName AuthServiceImpl
     *@Description 根据authId查找权限
     *@Author PowerNode
     *@Date 2020/12/2 10:22
     *@Version 1.0
     */
    @Override
    public Auth queryAuthById(Integer authId) {
        return authMapper.selectByPrimaryKey(authId);
    }
}