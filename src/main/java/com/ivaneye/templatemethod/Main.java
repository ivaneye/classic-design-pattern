package com.ivaneye.templatemethod;

/**
 * @author ivaneye
 * @since 2021-02-10 23:22:30
 */
public class Main {

    public static void main(String[] args) {
        Developer dev = new Developer();
        Testers testers = new Testers();
        dev.doProcess();
        testers.doProcess();
    }
}
