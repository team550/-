package com.bjpowernode.auth.util.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *@ClassName AccessRequired
 *@Description 在需要登录验证的Controller的方法上使用此注解
 *@Author MingZhiCai
 *@Date 2020/11/29 15:50
 *@Version 1.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired
{
    boolean loginSuccess() default true;
}