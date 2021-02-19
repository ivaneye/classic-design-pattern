package com.ivaneye.templatemethod;

/**
 * @author ivaneye
 * @since 2021-02-10 20:03:00
 */
public class Maven {

    /**
     * 构建流程
     */
    public void build() {
        compile();
        testCompile();
        test();
        doPackage();
        install();
    }

    protected void compile() {
        System.out.println("doCompile");
    }

    protected void testCompile() {
        System.out.println("doCompile");
    }

    protected void test() {
        System.out.println("doTest");
    }

    protected void doPackage() {
        System.out.println("doPackage");
    }

    protected void install() {
        System.out.println("doInstall");
    }
}
