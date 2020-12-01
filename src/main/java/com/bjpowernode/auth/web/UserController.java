/**
 * @ClassName UserController
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 16:38
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/user/login")
    public String login(){
        return "login";
    }

}