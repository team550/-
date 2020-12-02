package com.bjpowernode.auth.templete;

import java.util.List;

/*
 * @ClassName ControllerTemplete
 * @Description Controller模板
 * @author PowerNode
 * @Date 2020/10/22 8:39
 * @version 1.0
 */
public abstract class TempleteController<T> {

    public abstract ITempleteService<T> getService();

    public List<T> list(){
        return getService().list();
    }

    public T view(Integer id){

        return  getService().get(id);
    }

    public void add(){

    }

    public String save(T formData){

        getService().save(formData);

        return "redirect:list";
    }

    public T update(Integer id){
        return getService().get(id);
    }

    public String saveUpdate(T formData){

        getService().update(formData);

        return "redirect:list";
    }

    public String delete(Integer id){

        getService().delete(id);

        return "redirect:list";
    }

}
