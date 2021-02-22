package com.ivaneye.command;

/**
 * @author ivaneye
 * @since 2021-02-22 16:39:36
 */
public class User implements Domain {
    @Override
    public String create() {
        return "create user";
    }

    @Override
    public String retrieve() {
        return "retrieve user";
    }

    @Override
    public String update() {
        return "update user";
    }

    @Override
    public String delete() {
        return "delete user";
    }
}
