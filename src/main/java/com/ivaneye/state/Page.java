package com.ivaneye.state;

/**
 * 页面接口
 *
 * @author ivaneye
 * @since 2021-02-22 10:18:28
 */
public interface Page {

    /**
     * 模拟页面展示
     */
    String show();

    /**
     * 模拟页面点击
     */
    Page click();
}
