package com.ivaneye.abstractfactory.fm;

/**
 * Linux内存管理
 *
 * @author ivaneye
 * @since 2021-02-19 16:29:07
 */
public class LinuxRAM implements RAM {

    @Override
    public String read() {
        return "LinuxRAM";
    }
}
