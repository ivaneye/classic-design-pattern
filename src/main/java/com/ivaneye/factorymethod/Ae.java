package com.ivaneye.factorymethod;

/**
 * @author ivaneye
 * @since 2021-02-20 10:39:27
 */
public class Ae {

    private IOFactory ioFactory = new IOFactoryImpl();

    public void aeMain() {
        IO io = ioFactory.create();
        System.out.println("loop by " + io.aeApiPoll());
    }
}
