package com.ivaneye.command;

/**
 * 浏览器（Invoker）
 * @author ivaneye
 * @since 2021-02-22 16:27:55
 */
public class Browser {

    public void send(Method method) {
        String str = method.exec();
        System.out.println(str);
    }

}
