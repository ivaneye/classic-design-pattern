package com.ivaneye.abstractfactory.fm;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class KqueueFactory implements IOFactory {

    @Override
    public IO create() {
        return new Kqueue();
    }
}
