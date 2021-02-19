package com.ivaneye.templatemethod;

/**
 * 项目A
 *
 * @author ivaneye
 * @since 2021-02-10 23:18:04
 */
public class ProjectA extends Maven {

    @Override
    protected void compile() {
        // 直接覆盖默认编译逻辑
        System.out.println("compile ProjectA");
    }

    @Override
    protected void doPackage() {
        // 添加打包逻辑
        System.out.println("copy beforePackage");
        super.doPackage();
    }
}
