package com.ivaneye.visitor;

/**
 * @author ivaneye
 * @since 2021-03-31 16:21:11
 */
public class OA implements Software {

    @Override
    public void accept(Member member) {
        member.view(this);
    }

    @Override
    public void showSecurityArch() {
        System.out.println("OA SecurityArch");
    }

    @Override
    public void showDevArch() {
        System.out.println("OA DevArch");
    }

    @Override
    public void showSystemArch() {
        System.out.println("OA SystemArch");
    }

    @Override
    public void showProdArch() {
        System.out.println("OA ProdArch");
    }

    @Override
    public void showDeployArch() {
        System.out.println("OA DeployArch");
    }
}
