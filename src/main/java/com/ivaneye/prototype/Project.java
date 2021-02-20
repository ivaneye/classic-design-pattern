package com.ivaneye.prototype;

/**
 * @author ivaneye
 * @since 2021-02-20 16:39:18
 */
public class Project implements Git {

    private String name;
    private String cont;
    private Git subTree;

    public Project(String name, String cont) {
        this.name = name;
        this.cont = cont;
    }

    public Project(String name, String cont, Git subTree) {
        this.name = name;
        this.cont = cont;
        this.subTree = subTree;
    }

    @Override
    public Git clone() {
        if (subTree == null) {
            return new Project(this.name, this.cont);
        }
        return new Project(this.name, this.cont, subTree.clone());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", cont='" + cont + '\'' +
                ", subTree=" + subTree +
                '}';
    }
}
