package com.ivaneye.state;

/**
 * 由一个个网页组成的网络
 *
 * @author ivaneye
 * @since 2021-02-22 10:17:01
 */
public class REST {

    // REST的状态
    private Page page;

    public REST() {
        // 默认首页
        this.page = new HomePage();
    }

    // 展示页面，模拟页面渲染
    public void show() {
        System.out.println(page.render());
    }

    // 每次点击，改变REST状态。模拟的是页面的超链接点击
    public void click() {
        page = page.click();
        show();
    }
}
