package com.ivaneye.factorymethod;

/**
 * @author ivaneye
 * @since 2021-02-19 16:29:07
 */
public class Evport implements IO {

    @Override
    public String aeApiPoll() {
        return "evport";
    }
}
