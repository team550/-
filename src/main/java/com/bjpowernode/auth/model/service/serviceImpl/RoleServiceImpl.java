/**
 * @ClassName RoleServiceImpl
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 21:26
 * @Version 1.0
 */
package com.bjpowernode.auth.model.service.serviceImpl;

import com.bjpowernode.auth.entity.Role;
import com.bjpowernode.auth.model.mapper.RoleAuthMapper;
import com.bjpowernode.auth.model.mapper.RoleMapper;
import com.bjpowernode.auth.model.service.RoleService;
import com.bjpowernode.auth.templete.ITempleteDao;
import com.bjpowernode.auth.templete.TempleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends TempleteService<Role> implements RoleService  {

    @Autowired
    RoleMapper roleMapper;

    /**
     *@ClassName RoleServiceImpl
     *@Description 钩子
     *@Author PowerNode
     *@Date 2020/12/1 21:27
     *@Version 1.0
     */
    @Override
    public ITempleteDao<Role> getDao() {
        return roleMapper;
    }

    /**
     *@ClassName RoleServiceImpl
     *@Description 根据roleId查找角色
     *@Author PowerNode
     *@Date 2020/12/2 10:31
     *@Version 1.0
     */
    @Override
    public Role queryAuthById(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }
}