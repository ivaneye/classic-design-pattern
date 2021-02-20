package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-20 10:39:27
 */
public class Ae {

    private SystemFactory systemFactory;

    public Ae(SystemFactory systemFactory) {
        this.systemFactory = systemFactory;
    }

    public void aeMain() {
        IO io = systemFactory.createIO();
        RAM ram = systemFactory.createRAM();
        System.out.println("loop by " + io.aeApiPoll());
        System.out.println("read from " + ram.read());
        System.out.println("==========================");
    }
}
