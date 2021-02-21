package com.ivaneye.abstractfactory.fm;

/**
 * Linux内存管理工厂
 *
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class LinuxRAMFactory implements RAMFactory {

    @Override
    public RAM create() {
        return new LinuxRAM();
    }
}
