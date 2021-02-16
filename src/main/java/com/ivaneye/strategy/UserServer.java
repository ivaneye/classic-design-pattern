package com.ivaneye.strategy;

/**
 * @author ivaneye
 * @since 2021-02-16 17:51:24
 */
public class UserServer implements Server {

    @Override
    public void service() {
        System.out.println("UserServer");
    }
}
