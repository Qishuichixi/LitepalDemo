package com.qishui.zhou.litepaldemo.bean;

import org.litepal.crud.DataSupport;

/**
 * 作者：Created by zhou on 2017/6/10 20:22
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：
 */

public class IntroductionBean extends DataSupport {

    private int id;

    private String name;

    private NewsBean newsBean;//一个简介对应一条新闻

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


    public NewsBean getNewsBean() {
        return newsBean;
    }

    public void setNewsBean(NewsBean newsBean) {
        this.newsBean = newsBean;
    }
    public  IntroductionBean(){}
    public IntroductionBean(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IntroductionBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", newsBean=" + newsBean +
                '}';
    }

}
