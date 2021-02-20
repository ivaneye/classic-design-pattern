package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class SolarisFactory implements SystemFactory {

    @Override
    public IO createIO() {
        return new Evport();
    }

    @Override
    public RAM createRAM() {
        return new SolarisRAM();
    }
}
