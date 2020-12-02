/**
 * @ClassName AuthController
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 15:59
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import com.bjpowernode.auth.entity.Auth;
import com.bjpowernode.auth.model.service.AuthService;
import com.bjpowernode.auth.templete.ITempleteService;
import com.bjpowernode.auth.templete.TempleteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class AuthController  extends TempleteController<Auth> {


    @Autowired
    AuthService authService;
/**
 *@ClassName AuthController
 *@Description 钩子
 *@Author PowerNode
 *@Date 2020/12/1 20:52
 *@Version 1.0
 */

    @Override
    public ITempleteService<Auth> getService() {
        return authService;
    }

    /**
     *@ClassName AuthController
     *@Description 查询所有权限
     *@Author PowerNode
     *@Date 2020/12/1 20:55
     *@Version 1.0
     */
    @RequestMapping("/auth/list")
    @Override
    public List<Auth> list() {
        return super.list();
    }

    /**
     *@ClassName AuthController
     *@Description 跳转 保存/修改页面
     *@Author PowerNode
     *@Date 2020/12/2 9:12
     *@Version 1.0
     */
    @RequestMapping("/auth/edit")
    public String edit(Auth auth, Model model){
        //判断id是否有值，有值根据id查员工返回去，没值 保存
        if (ObjectUtils.isEmpty(auth.getAuthId())){
            //添加权限默认启用1
            auth.setAuthStatus(1);
            return "auth/edit";
        }else {
            auth = authService.queryAuthById(auth.getAuthId());
            model.addAttribute("auth",auth);
            return "auth/edit";
        }
    }

    /**
     *@ClassName AuthController
     *@Description 保存
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("/auth/save")
    @Override
    public String save(Auth formData) {
        return super.save(formData);
    }
    /**
     *@ClassName AuthController
     *@Description 修改
     *@Author PowerNode
     *@Date 2020/12/2 9:36
     *@Version 1.0
     */
    @RequestMapping("auth/saveUpdate")
    @Override
    public String saveUpdate(Auth formData) {
        return super.saveUpdate(formData);
    }
}