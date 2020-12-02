package com.bjpowernode.auth.templete;

import java.util.List;

/*
 * @ClassName ITempleteDao
 * @Description service接口模板
 * @author PowerNode
 * @Date 2020/10/22 8:39
 * @version 1.0
 */
public interface ITempleteService<T> {

    List<T> list();

    T get(Integer id);

    int save(T obj);

    int update(T obj);

    int delete(Integer id);

    ITempleteDao<T> getDao();
}
