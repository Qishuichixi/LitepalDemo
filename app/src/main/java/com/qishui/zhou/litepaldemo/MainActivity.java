package com.qishui.zhou.litepaldemo;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.qishui.zhou.litepaldemo.bean.Category;
import com.qishui.zhou.litepaldemo.bean.CommentBean;
import com.qishui.zhou.litepaldemo.bean.IntroductionBean;
import com.qishui.zhou.litepaldemo.bean.NewsBean;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.tv);

        //创建数据库
        SQLiteDatabase db = Connector.getDatabase();
        DataSupport.deleteAll(NewsBean.class);//清空新闻表数据，顺便会把关联评论表数据给删除掉
        DataSupport.deleteAll(CommentBean.class);//清空评论表数据，顺便会把关联评论表数据给删除掉
        DataSupport.deleteAll(Category.class);
        DataSupport.deleteAll(IntroductionBean.class);

        //发布一条新闻
        NewsBean newsBean = new NewsBean("丰城风景秀天下", "数据源", System.currentTimeMillis());
        newsBean.saveOrUpdate();
        ////设置评论
        List<CommentBean> commentBeanList = new ArrayList<CommentBean>();
        for (int i = 0; i < 30; i++) {
            CommentBean bean = new CommentBean(System.currentTimeMillis() + 1000 * 60 * 60, "小白", "今天天气不错!+" + i);
            commentBeanList.add(bean);
        }
        DataSupport.saveAll(commentBeanList);
        newsBean.setList(commentBeanList);
        //设置简介
        IntroductionBean introductionBean = new IntroductionBean("丰城是江西下的直辖市，气候适中。");
        introductionBean.save();
        newsBean.setIntroductionBean(introductionBean);
        //设置类别
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("丰城"));
        categoryList.add(new Category("环境"));
        categoryList.add(new Category("温度"));
        DataSupport.saveAll(categoryList);
        newsBean.setCategoryList(categoryList);
        //保存更新数据
        newsBean.save();

        //查询所有数据
        List<NewsBean> list1 = DataSupport.findAll(NewsBean.class);
        List<CommentBean> list2 = DataSupport.findAll(CommentBean.class);
        List<Category> list3 = DataSupport.findAll(Category.class);
        List<IntroductionBean> list4 = DataSupport.findAll(IntroductionBean.class);

        tv.setText(list1.toString() + "\n\n" + list2.toString()+"\n\n"+list3.toString()+"\n\n"+list4.toString());


    }
}
