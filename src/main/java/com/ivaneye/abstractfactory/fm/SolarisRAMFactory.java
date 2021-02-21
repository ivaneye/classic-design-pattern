package com.ivaneye.abstractfactory.fm;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class SolarisRAMFactory implements RAMFactory {

    @Override
    public RAM create() {
        return new SolarisRAM();
    }
}
