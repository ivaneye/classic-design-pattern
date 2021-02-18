package com.ivaneye.builder;

/**
 * ConcreteBuilder
 * @author ivaneye
 * @since 2021-02-18 16:07:05
 */
public class LinuxMakeFile extends MakeFile {

    @Override
    public MakeFile withClassDir(String classDir) {
        // 将classDir目录下的jar拼接为完整的classPath
        this.classPath = classDir + "(Linux)";
        return this;
    }

    @Override
    public MakeFile withTargetFolder(String targetFolder) {
        // 检查targetFolder是否已存在，不存在就创建
        this.targetFolder = targetFolder + "(Linux)";
        return this;
    }
}
