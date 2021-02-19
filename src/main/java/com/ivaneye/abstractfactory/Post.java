package com.ivaneye.abstractfactory;

/**
 * 帖子接口
 *
 * @author ivaneye
 * @since 2021-02-19 16:27:05
 */
public abstract class Post {

    // 定义数据结构
    private String title;
    private String cont;

    // 定义的方法
    public abstract void save();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}
