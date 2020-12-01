/**
 * @ClassName AuthController
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 15:59
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
    @RequestMapping("/auth/index")
    public String index(){

        return "index";
    }
}