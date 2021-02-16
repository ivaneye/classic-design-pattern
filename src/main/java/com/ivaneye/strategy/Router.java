package com.ivaneye.strategy;

import java.util.Map;

/**
 * 路由（Context）
 *
 * @author ivaneye
 * @since 2021-02-16 17:51:48
 */
public class Router {

    // 经典策略模式这里持有的Server类型，这里模拟了路由表
    private Map<String, Server> serverMap;

    public Router(Map<String, Server> serverMap) {
        this.serverMap = serverMap;
    }

    public void invoke(String path) {
        serverMap.get(path).service();
    }
}
