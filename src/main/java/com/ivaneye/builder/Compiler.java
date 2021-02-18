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

    public Compiler(MakeFile makeFile) {
        this.classPath = makeFile.getClassPath();
        this.javaFile = makeFile.getJavaFile();
        this.targetFolder = makeFile.getTargetFolder();
    }

    public void compile() {
        String sh = "javac -cp " + classPath + " " + javaFile + " -d " + targetFolder;
        System.out.println(sh);
    }
}
