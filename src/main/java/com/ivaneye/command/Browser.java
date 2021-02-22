package com.ivaneye.command;

/**
 * @author ivaneye
 * @since 2021-02-22 16:27:55
 */
public class Browser {

    public void send(Method method) {
        String str = method.exec();
        System.out.println(str);
    }

}
