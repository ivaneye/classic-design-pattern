package com.ivaneye.builder;

/**
 * Product
 * @author ivaneye
 * @since 2021-02-18 16:15:34
 */
public class Compiler {

    private String classPath;
    private String javaFile;
    private String targetFolder;

    public Compiler(CompilerBuilder compilerBuilder) {
        this.classPath = compilerBuilder.getClassPath();
        this.javaFile = compilerBuilder.getJavaFile();
        this.targetFolder = compilerBuilder.getTargetFolder();
    }

    public void compile() {
        String sh = "javac -cp " + classPath + " " + javaFile + " -d " + targetFolder;
        System.out.println(sh);
    }
}
