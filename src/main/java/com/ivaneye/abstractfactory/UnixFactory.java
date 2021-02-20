package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class UnixFactory implements SystemFactory {

    @Override
    public IO createIO() {
        return new Kqueue();
    }

    @Override
    public RAM createRAM() {
        return new UnixRAM();
    }
}
