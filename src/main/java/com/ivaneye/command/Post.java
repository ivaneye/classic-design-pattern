package com.ivaneye.command;

/**
 * Post请求（Command实现）
 *
 * @author ivaneye
 * @since 2021-02-22 16:31:37
 */
public class Post implements Method {

    private Domain domain;

    public Post(Domain domain) {
        this.domain = domain;
    }

    @Override
    public String exec() {
        return domain.create();
    }
}
