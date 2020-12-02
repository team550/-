/**
 * @ClassName UserController
 * @Description 用户控制器
 * @Author PowerNode
 * @Date 2020/12/1 16:38
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import com.bjpowernode.auth.entity.User;
import com.bjpowernode.auth.model.service.UserService;
import com.bjpowernode.auth.templete.ITempleteService;
import com.bjpowernode.auth.templete.TempleteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Controller
public class UserController extends TempleteController<User> {

    @Autowired
    UserService userService;
    /**
     *@ClassName UserController
     *@Description 钩子
     *@Author PowerNode
     *@Date 2020/12/1 19:11
     *@Version 1.0
     */
    @Override
    public ITempleteService<User> getService() {
        return userService;
    }

    /**
     *@ClassName UserController
     *@Description 查询所有员工
     *@Author PowerNode
     *@Date 2020/12/1 20:38
     *@Version 1.0
     */
    @Override
    @RequestMapping("/user/list")
    public  List<User> list(){
      return   userService.list();
    }


    /**
     *@ClassName UserController
     *@Description 跳转 保存/修改页面
     *@Author PowerNode
     *@Date 2020/12/2 9:12
     *@Version 1.0
     */
    @RequestMapping("/user/edit")
    public String edit(User user,Model model){
        //判断id是否有值，有值根据id查员工返回去，没值 保存
        if (ObjectUtils.isEmpty(user.getUserId())){
            return "user/edit";
        }else {
             user = userService.queryUserById(user.getUserId());
            model.addAttribute("user",user);
            return "user/edit";
        }
    }


    /**
     *@ClassName UserController
     *@Description 保存
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("/user/save")
    @Override
    public String save(User formData) {
        return super.save(formData);
    }
    /**
     *@ClassName UserController
     *@Description 修改
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("user/saveUpdate")
    @Override
    public String saveUpdate(User formData) {
        return super.saveUpdate(formData);
    }


}