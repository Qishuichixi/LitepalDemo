package com.qishui.zhou.litepaldemo.bean;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by zhou on 2017/6/10 20:28
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class Category extends DataSupport{

    private  int id;
    private String name ;

    private List<NewsBean>list=new ArrayList<>();//一条新闻可能有多个种类、一个种类包含多条新闻，需要一张外表保存
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NewsBean> getList() {
        return list;
    }

    public void setList(List<NewsBean> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }

    public Category(String name) {
        this.name = name;
    }
}
