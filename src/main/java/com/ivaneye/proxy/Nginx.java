package com.ivaneye.proxy;

import java.util.List;

/**
 * @author ivaneye
 * @since 2021-02-23 09:35:32
 */
public class Nginx implements Server {

    private List<Server> serverList;
    private int idx = 0;

    public Nginx(List<Server> serverList) {
        this.serverList = serverList;
    }

    @Override
    public String visit() {
        Server server = chooseServer();
        return server.visit();
    }

    /**
     * 负载均衡，轮询
     *
     * @return
     */
    private Server chooseServer() {
        if (idx >= serverList.size()) {
            idx = 0;
        }
        Server server = serverList.get(idx);
        idx++;
        return server;
    }
}
