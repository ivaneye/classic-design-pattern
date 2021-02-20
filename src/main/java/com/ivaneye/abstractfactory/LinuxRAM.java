package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-20 15:09:09
 */
public class LinuxRAM implements RAM {

    @Override
    public String read() {
        return "LinuxRAM";
    }
}
