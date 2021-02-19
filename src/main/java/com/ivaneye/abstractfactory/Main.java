package com.ivaneye.abstractfactory;

/**
 * 假设这是客户端
 * @author ivaneye
 * @since 2021-02-19 16:19:48
 */
public class Main {

    public static void main(String[] args) {
        PostFactory factory = new PostFactoryImpl();
        Post post = factory.create();
        post.save();
    }
}
