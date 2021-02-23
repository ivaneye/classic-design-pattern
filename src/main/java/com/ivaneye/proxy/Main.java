package com.ivaneye.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ivaneye
 * @since 2021-02-23 09:36:00
 */
public class Main {

    public static void main(String[] args) {
        List<Server> serverList = new ArrayList() {{
            this.add(new WebServer("A"));
            this.add(new WebServer("B"));
            this.add(new WebServer("C"));
        }};
        Server proxy = new Nginx(serverList);
        System.out.println(proxy.visit());
        System.out.println(proxy.visit());
        System.out.println(proxy.visit());
        System.out.println(proxy.visit());
    }

}
