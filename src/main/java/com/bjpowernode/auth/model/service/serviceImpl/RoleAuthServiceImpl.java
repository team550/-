/**
 * @ClassName RoleAuthServiceImpl
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 21:09
 * @Version 1.0
 */
package com.bjpowernode.auth.model.service.serviceImpl;

import com.bjpowernode.auth.entity.RoleAuth;
import com.bjpowernode.auth.model.mapper.RoleAuthMapper;
import com.bjpowernode.auth.model.service.RoleAuthService;
import com.bjpowernode.auth.templete.ITempleteDao;
import com.bjpowernode.auth.templete.TempleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleAuthServiceImpl extends TempleteService<RoleAuth> implements RoleAuthService {

    @Autowired
    RoleAuthMapper roleAuthMapper;

    @Override
    public ITempleteDao<RoleAuth> getDao() {
        return roleAuthMapper;
    }
}