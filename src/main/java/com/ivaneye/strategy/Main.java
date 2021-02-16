package com.ivaneye.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 假设这是Client
 *
 * @author ivaneye
 * @since 2021-02-16 17:47:08
 */
public class Main {

    public static void main(String[] args) {
        Map<String, Server> serverMap = new HashMap<>();
        serverMap.put("user", new UserServer());
        serverMap.put("order", new OrderServer());
        Router router = new Router(serverMap);
        router.invoke("user");
        router.invoke("order");
    }
}
