package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class SelectFactory implements IOFactory {

    @Override
    public IO create() {
        return new Select();
    }
}
