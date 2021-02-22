package com.ivaneye.state;

/**
 * 首页
 *
 * @author ivaneye
 * @since 2021-02-22 10:26:57
 */
public class HomePage implements Page {

    @Override
    public String show() {
        return "Home";
    }

    @Override
    public Page click() {
        return new ListPage();
    }
}
