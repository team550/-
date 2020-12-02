package com.bjpowernode.auth.web;

import com.bjpowernode.auth.util.common.LoginRequired;
import com.bjpowernode.auth.util.constants.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    /**
     * 映射首页
     */
    @LoginRequired
    @RequestMapping({"/","index"})
    String index(){

        return "index";
    }

    /**
     * 映射首页的右边
     */
    @RequestMapping("/right")
    void right(){
    }

}
