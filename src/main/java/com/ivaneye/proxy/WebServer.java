package com.ivaneye.proxy;

/**
 * Web服务
 *
 * @author ivaneye
 * @since 2021-02-23 09:34:53
 */
public class WebServer implements Server {

    private String name;

    public WebServer(String name) {
        this.name = name;
    }

    @Override
    public String visit() {
        return "WebServer:" + this.name;
    }
}
