package com.ivaneye.prototype;

/**
 * @author ivaneye
 * @since 2021-02-20 16:37:50
 */
public class Main {

    public static void main(String[] args) {
        // 没有subtree的项目
        Project project = new Project("pa", "ca");
        System.out.println(project);
        // git clone
        System.out.println(project.clone());
        // 有subtree的项目
        Project subTree = new Project("subTree", "subTreeCont");
        Project projectB = new Project("pb", "cb", subTree);
        System.out.println(projectB);
        // git clone
        Git clone = projectB.clone();
        System.out.println(clone);
        // 子项目修改
        subTree.setName("subTree222");
        subTree.setCont("cont222");
        // 原来clone的项目代码没有变化
        System.out.println(clone);
        // 新clone的项目获取到最新的代码
        System.out.println(projectB.clone());
    }
}
