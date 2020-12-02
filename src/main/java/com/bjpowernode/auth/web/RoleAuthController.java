/**
 * @ClassName RoleAuthController
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/1 21:12
 * @Version 1.0
 */
package com.bjpowernode.auth.web;

import com.bjpowernode.auth.entity.RoleAuth;
import com.bjpowernode.auth.model.service.RoleAuthService;
import com.bjpowernode.auth.templete.ITempleteService;
import com.bjpowernode.auth.templete.TempleteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




@Controller
public class RoleAuthController extends TempleteController<RoleAuth> {

    @Autowired
    RoleAuthService roleAuthService;
    /**
     *@ClassName RoleAuthController
     *@Description 钩子
     *@Author PowerNode
     *@Date 2020/12/1 21:13
     *@Version 1.0
     */
    @Override
    public ITempleteService<RoleAuth> getService() {
        return roleAuthService;
    }


}