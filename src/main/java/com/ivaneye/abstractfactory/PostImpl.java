package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:29:07
 */
public class PostImpl extends Post {
    @Override
    public void save() {
        System.out.println("save post");
    }
}
