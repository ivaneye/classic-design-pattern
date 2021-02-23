package com.ivaneye.command;

/**
 * 模拟对象（Target接口）
 *
 * @author ivaneye
 * @since 2021-02-22 16:35:49
 */
public interface Domain {

    String create();

    String retrieve();

    String update();

    String delete();
}
