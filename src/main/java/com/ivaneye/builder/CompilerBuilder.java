package com.ivaneye.builder;

/**
 * Builder
 * @author ivaneye
 * @since 2021-02-18 16:07:05
 */
public abstract class CompilerBuilder {

    protected String classPath;
    protected String javaFile;
    protected String targetFolder;

    public abstract CompilerBuilder withClassDir(String classDir);
    public abstract CompilerBuilder withTargetFolder(String targetFolder);

    public CompilerBuilder withJavaFile(String javaFile) {
        this.javaFile = javaFile;
        return this;
    }

    public String getClassPath() {
        return classPath;
    }

    public String getJavaFile() {
        return javaFile;
    }

    public String getTargetFolder() {
        return targetFolder;
    }

    public Compiler build() {
        return new Compiler(this);
    }
}
