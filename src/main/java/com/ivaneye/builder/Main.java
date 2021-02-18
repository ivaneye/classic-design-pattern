package com.ivaneye.builder;

/**
 * @author ivaneye
 * @since 2021-02-18 13:46:02
 */
public class Main {

    public static void main(String[] args) {
        // Window下执行cmd
        Project project = new Project(new WinCompilerBuilder());
        project.run();
        // Linux下执行shell
        project = new Project(new LinuxCompilerBuilder());
        project.run();
    }
}
