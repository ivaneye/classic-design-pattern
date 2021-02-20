package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:29:07
 */
public class Select implements IO {

    @Override
    public String aeApiPoll() {
        return "select";
    }
}
