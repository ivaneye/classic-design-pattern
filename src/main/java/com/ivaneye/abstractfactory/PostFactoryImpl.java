package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class PostFactoryImpl implements PostFactory {

    @Override
    public Post create() {
        return new PostImpl();
    }
}
