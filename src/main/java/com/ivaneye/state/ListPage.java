package com.ivaneye.state;

/**
 * 列表页面
 *
 * @author ivaneye
 * @since 2021-02-22 10:28:47
 */
public class ListPage implements Page {
    @Override
    public String show() {
        return "List";
    }

    @Override
    public Page click() {
        return new DetailPage();
    }
}
