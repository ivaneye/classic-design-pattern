package com.ivaneye.command;

/**
 * 模拟注释对象
 *
 * @author ivaneye
 * @since 2021-02-22 16:40:26
 */
public class Comment implements Domain {

    @Override
    public String create() {
        return "create comment";
    }

    @Override
    public String retrieve() {
        return "retrieve comment";
    }

    @Override
    public String update() {
        return "update comment";
    }

    @Override
    public String delete() {
        return "delete comment";
    }
}
