/**
 * @ClassName LoginController
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 21:40
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import com.bjpowernode.auth.entity.User;
import com.bjpowernode.auth.model.service.UserService;
import com.bjpowernode.auth.templete.ITempleteService;
import com.bjpowernode.auth.util.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName LoginController
 *@Description 账号控制器
 *@Author PowerNode
 *@Date 2020/12/1 21:40
 *@Version 1.0
 */
@Controller
public class LoginController  {

    @Autowired
    UserService userService;



    public ITempleteService<User> getService() {
        return userService;
    }
    /**
     *@ClassName UserController
     *@Description 进入登录页面
     *@Author PowerNode
     *@Date 2020/12/1 18:53
     *@Version 1.0
     */
    @RequestMapping("/user/login")
    public String login(){
        return "login";
    }

    /**
     *@ClassName UserController
     *@Description 登录提交
     *@Author PowerNode
     *@Date 2020/12/1 18:53
     *@Version 1.0
     */
    @RequestMapping("/user/saveLogin")
    public String saveLogin(@RequestParam(name = "userName",required = true) String userName,
                            @RequestParam(name = "userPwd",required = true) String userPwd
            , HttpServletRequest request){

        Map<String,Object> parasMap = new HashMap<>();
        parasMap.put("userName",userName);
        parasMap.put("userPwd",userPwd);
        //验证登录
        User user = userService.saveLogin(parasMap);
        if (ObjectUtils.isEmpty(user)){
            return "login";
        }else {
            request.getSession().setAttribute(Constants.LOGIN_USER,user);
        }
        return "redirect:/index";
    }
    /**
     *@ClassName LoginController
     *@Description 登出
     *@Author PowerNode
     *@Date 2020/12/2 11:02
     *@Version 1.0
     */
    @RequestMapping("/user/logOut")
    public String logOut(HttpServletRequest request){
        //清除Session
        request.getSession().removeAttribute(Constants.LOGIN_USER);
        return "login";
    }



}