package com.ivaneye.abstractfactory.fm;

/**
 * @author ivaneye
 * @since 2021-02-19 16:29:07
 */
public class UnixRAM implements RAM {

    @Override
    public String read() {
        return "UnixRAM";
    }
}
