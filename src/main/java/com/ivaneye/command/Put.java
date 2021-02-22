package com.ivaneye.command;

/**
 * Put请求
 *
 * @author ivaneye
 * @since 2021-02-22 16:31:37
 */
public class Put implements Method {

    private Domain domain;

    public Put(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String exec() {
        return domain.update();
    }
}
