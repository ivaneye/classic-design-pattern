package com.ivaneye.command;

/**
 * Delete请求（Command实现）
 *
 * @author ivaneye
 * @since 2021-02-22 16:31:37
 */
public class Delete implements Method {

    private Domain domain;

    public Delete(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String exec() {
        return domain.delete();
    }
}
