package com.ivaneye.state;

/**
 * 详情页面
 *
 * @author ivaneye
 * @since 2021-02-22 10:29:09
 */
public class DetailPage implements Page {
    @Override
    public String render() {
        return "Detail";
    }

    @Override
    public Page click() {
        return new HomePage();
    }
}
