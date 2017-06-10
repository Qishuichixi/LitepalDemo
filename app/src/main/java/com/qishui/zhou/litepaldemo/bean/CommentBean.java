package com.qishui.zhou.litepaldemo.bean;

import org.litepal.crud.DataSupport;

/**
 * 作者：Created by zhou on 2017/6/10 17:55
 * 邮箱：qishuichixi@126.com
 * 版本：V 1.0
 * 描述：评论
 */

public class CommentBean extends DataSupport {


    private int id;
    private long time;//评论时间
    private String nickname;//评论昵称
    private String content;//评论内容
    private NewsBean newsBean;//一条评论对应一条新闻

    public NewsBean getNewsBean() {
        return newsBean;
    }

    public void setNewsBean(NewsBean newsBean) {
        this.newsBean = newsBean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public CommentBean(){};
    public CommentBean(long time, String nickname, String content) {
        this.time = time;
        this.nickname = nickname;
        this.content = content;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "id=" + id +
                ", time=" + time +
                ", nickname='" + nickname + '\'' +
                ", content=" + content +
                ", newsBean=" + newsBean +
                '}';
    }
}
