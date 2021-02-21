package com.ivaneye.factorymethod;

/**
 * @author ivaneye
 * @since 2021-02-19 16:30:14
 */
public class IOFactoryImpl implements IOFactory {

    @Override
    public IO create() {
        // 确定创建哪个IO类型
        if (hasEvport()) {
            return new Evport();
        } else {
            if (hasEpoll()) {
                return new Epoll();
            } else if (hasKqueue()) {
                return new Kqueue();
            } else {
                return new Select();
            }
        }
    }

    private boolean hasKqueue() {
        return false;
    }

    private boolean hasEpoll() {
        return true;
    }

    private boolean hasEvport() {
        return false;
    }
}
