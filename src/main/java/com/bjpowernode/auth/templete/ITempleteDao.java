package com.bjpowernode.auth.templete;

import java.util.List;

/*
 * @ClassName ITempleteDao
 * @Description dao接口模板
 * @author PowerNode
 * @Date 2020/10/22 8:39
 * @version 1.0
 */
public interface ITempleteDao<T> {

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    List<T> selectAll();

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
