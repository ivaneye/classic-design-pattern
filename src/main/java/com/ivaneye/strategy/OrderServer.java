package com.ivaneye.strategy;

/**
 * @author ivaneye
 * @since 2021-02-16 17:50:59
 */
public class OrderServer implements Server {
    
    @Override
    public void service() {
        System.out.println("OrderServer");
    }
}
