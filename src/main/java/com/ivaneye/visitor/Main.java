package com.ivaneye.visitor;

/**
 * @author ivaneye
 * @since 2021-03-31 16:18:44
 */
public class Main {

    public static void main(String[] args) {
        Member member = new Developer();
        Software software = new OA();
        software.accept(member);
        member = new Product();
        software.accept(member);
    }
}
