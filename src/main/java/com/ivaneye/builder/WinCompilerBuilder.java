package com.ivaneye.builder;

/**
 * ConcreteBuilder
 *
 * @author ivaneye
 * @since 2021-02-18 16:07:05
 */
public class WinCompilerBuilder extends CompilerBuilder {

    @Override
    public CompilerBuilder withClassDir(String classDir) {
        // 将classDir目录下的jar拼接为完整的classPath
        this.classPath = classDir + "(Windows)";
        return this;
    }

    @Override
    public CompilerBuilder withTargetFolder(String targetFolder) {
        // 检查targetFolder是否已存在，不存在就创建
        this.targetFolder = targetFolder + "(Windows)";
        return this;
    }
}
