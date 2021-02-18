package com.ivaneye.builder;

/**
 * 具体项目（Director）
 *
 * @author ivaneye
 * @since 2021-02-18 16:46:39
 */
public class Project {

    private CompilerBuilder builder;

    public Project(CompilerBuilder builder) {
        this.builder = builder;
    }

    public void run() {
        Compiler compiler = builder.withClassDir("classPath")
                .withJavaFile("javaFile")
                .withTargetFolder("targetFolder").build();
        compiler.compile();
    }

}
