package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:19:48
 */
public class Main {

    public static void main(String[] args) {
        // 根据环境设置工厂
        IOFactory ioFactory = new EpollFactory();
//        IOFactory ioFactory = new SelectFactory();
//        IOFactory ioFactory = new KqueueFactory();
//        IOFactory ioFactory = new EvportFactory();
        Ae ae = new Ae(ioFactory);
        ae.aeMain();
    }
}
