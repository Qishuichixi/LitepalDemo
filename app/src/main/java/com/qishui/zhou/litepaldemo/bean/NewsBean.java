package com.qishui.zhou.litepaldemo.bean;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：Created by zhou on 2017/6/10 15:59
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：NewsBean新闻类—---创建表名NewsBean
 */

public class NewsBean extends DataSupport{

    private int id;//编号ID
    private String title;//标题
    private String content;//内容
    private long time;//发布时间

    private List<CommentBean>list=new ArrayList<CommentBean>();//一条新闻对应多条评论
    private List<Category>categoryList=new ArrayList<>();//一条新闻对应多个种类
    private IntroductionBean introductionBean;//一条新闻对应一个简洁


    @Override
    public String toString() {
        return "NewsBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", list=" + list +
                ", categoryList=" + categoryList +
                ", introductionBean=" + introductionBean +
                '}';
    }




    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public IntroductionBean getIntroductionBean() {
        return introductionBean;
    }

    public void setIntroductionBean(IntroductionBean introductionBean) {
        this.introductionBean = introductionBean;
    }

    public List<CommentBean> getList() {
        return list;
    }

    public void setList(List<CommentBean> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public NewsBean(){}
    public NewsBean(String title, String content, long time) {
        this.title = title;
        this.content = content;
        this.time = time;
    }
}
