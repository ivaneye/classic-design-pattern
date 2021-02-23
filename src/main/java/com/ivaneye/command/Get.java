package com.ivaneye.command;

/**
 * Get请求（Command实现）
 *
 * @author ivaneye
 * @since 2021-02-22 16:31:37
 */
public class Get implements Method {

    private Domain domain;

    public Get(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String exec() {
        return domain.retrieve();
    }
}
