/**
 * @ClassName AuthInterceptor
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/12/2 11:23
 * @Version 1.0
 */
package com.bjpowernode.auth.util.interceptor;

import com.bjpowernode.auth.util.common.LoginRequired;
import com.bjpowernode.auth.util.constants.Constants;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@ClassName LoginInterceptor
 *@Description 编写拦截器
 *@Author MingZhiCai
 *@Date 2020/11/29 16:00
 *@Version 1.0
 */
@Component
public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*// ①:START 方法注解级拦截器
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 判断接口是否需要登录
        LoginRequired loginRequired = method.getAnnotation(LoginRequired.class);*/

        LoginRequired loginRequired;

        if (handler instanceof HandlerMethod) {
            loginRequired = ((HandlerMethod) handler).getMethodAnnotation(LoginRequired.class);
        } else {
            return true;
        }
        /*// 拦截处理代码
        HandlerMethod method = (HandlerMethod) handler;
        //拿拦截注解
        LoginRequired loginRequired = method.getMethodAnnotation(LoginRequired.class);*/
        //判断拿到的拦截注解是否为null
        if (null != loginRequired) {

            if (request.getSession().getAttribute(Constants.LOGIN_USER) == null) {
                //这个是需要拦截的方法
                //用户当前未登录,送用户到登录界面
                request.getRequestDispatcher("/user/logOut").forward(request,response);
                return false;
            } /*else {
                //这个是不需要拦截的方法
                return true;
            }*/
        }
        //返回true通过，返回false拦截
        return true;
    }
}