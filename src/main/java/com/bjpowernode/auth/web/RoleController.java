/**
 * @ClassName RoleController
 * @Description 角色管理
 * @Author PowerNode
 * @Date 2020/12/1 21:30
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import com.bjpowernode.auth.entity.Role;
import com.bjpowernode.auth.model.service.RoleService;
import com.bjpowernode.auth.templete.ITempleteService;
import com.bjpowernode.auth.templete.TempleteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoleController  extends TempleteController<Role> {

    @Autowired
    RoleService roleService;

    /**
     *@ClassName RoleController
     *@Description 钩子
     *@Author PowerNode
     *@Date 2020/12/1 21:31
     *@Version 1.0
     */
    @Override
    public ITempleteService<Role> getService() {
        return roleService;
    }

    /**
     *@ClassName RoleController
     *@Description 查询所有角色
     *@Author PowerNode
     *@Date 2020/12/1 21:33
     *@Version 1.0
     */
    @RequestMapping("/role/list")
    @Override
    public List<Role> list() {
        return super.list();
    }

    /**
     *@ClassName RoleController
     *@Description 跳转 保存/修改页面
     *@Author PowerNode
     *@Date 2020/12/2 9:12
     *@Version 1.0
     */
    @RequestMapping("/role/edit")
    public String edit(Role role, Model model){
        //判断id是否有值，有值根据id查员工返回去，没值 保存
        if (ObjectUtils.isEmpty(role.getRoleId())){
            return "role/edit";
        }else {
            role = roleService.queryAuthById(role.getRoleId());
            model.addAttribute("role",role);
            return "role/edit";
        }
    }

    /**
     *@ClassName RoleController
     *@Description 保存
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("/role/save")
    @Override
    public String save(Role formData) {
        return super.save(formData);
    }
    /**
     *@ClassName RoleController
     *@Description 修改
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("role/saveUpdate")
    @Override
    public String saveUpdate(Role formData) {
        return super.saveUpdate(formData);
    }
}