package com.ivaneye.abstractfactory;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class EpollFactory implements IOFactory {

    @Override
    public IO create() {
        // 延后实现
        return new Epoll();
    }
}
