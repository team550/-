package com.bjpowernode.auth.templete;

import java.util.List;

/**
 * @ClassName TempleteService
 * @Description service实现类的模板
 * @author PowerNode
 * @Date 2020/10/22 8:42
 * @version 1.0
 */
public abstract class TempleteService<T> implements ITempleteService<T> {

    @Override
    public List<T> list() {
        return getDao().selectAll();
    }

    @Override
    public T get(Integer id) {
        return getDao().selectByPrimaryKey(id);
    }

    @Override
    public int save(T obj) {
        return getDao().insertSelective(obj);
    }

    @Override
    public int update(T obj) {
        return getDao().updateByPrimaryKeySelective(obj);
    }

    @Override
    public int delete(Integer id) {
        return getDao().deleteByPrimaryKey(id);
    }



}
