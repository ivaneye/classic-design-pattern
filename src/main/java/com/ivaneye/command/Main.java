package com.ivaneye.command;

/**
 * 模拟浏览器
 *
 * @author ivaneye
 * @since 2021-02-22 16:26:09
 */
public class Main {

    public static void main(String[] args) {
        Browser browser = new Browser();
        browser.send(new Post(new User()));
        browser.send(new Get(new User()));
        browser.send(new Put(new User()));
        browser.send(new Delete(new User()));
        browser.send(new Post(new Comment()));
        browser.send(new Get(new Comment()));
        browser.send(new Put(new Comment()));
        browser.send(new Delete(new Comment()));
    }

}
