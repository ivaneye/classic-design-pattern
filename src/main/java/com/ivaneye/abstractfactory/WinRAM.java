package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-20 15:09:09
 */
public class WinRAM implements RAM {

    @Override
    public String read() {
        return "WinRAM";
    }
}
