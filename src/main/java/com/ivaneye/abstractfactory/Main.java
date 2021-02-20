package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:19:48
 */
public class Main {

    public static void main(String[] args) {
        IOFactory ioFactory = new EpollFactory();
        Ae ae = new Ae(ioFactory);
        ae.aeMain();
    }
}