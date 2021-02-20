package com.ivaneye.factorymethod;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class EvportFactory implements IOFactory {

    @Override
    public IO create() {
        return new Evport();
    }
}
