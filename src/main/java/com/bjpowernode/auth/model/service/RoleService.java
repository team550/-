package com.bjpowernode.auth.model.service;

import com.bjpowernode.auth.entity.Role;
import com.bjpowernode.auth.templete.ITempleteService;

public interface RoleService extends ITempleteService<Role> {
    /**
     *@ClassName RoleService
     *@Description 根据roleId查找角色
     *@Author PowerNode
     *@Date 2020/12/2 10:30
     *@Version 1.0
     */
    Role queryAuthById(Integer roleId);
}
