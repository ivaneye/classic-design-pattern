package com.ivaneye.state;

/**
 * 模拟客户端
 *
 * @author ivaneye
 * @since 2021-02-22 10:16:25
 */
public class Main {

    public static void main(String[] args) {
        REST rest = new REST();
        // 默认展示首页
        rest.show();
        // 点击首页链接，展示列表页面
        rest.click();
        // 点击列表链接，展示详情页面
        rest.click();
        // 点击详情链接，展示首页页面
        rest.click();
    }
}
