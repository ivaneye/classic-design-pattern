package com.ivaneye.visitor;

/**
 * 系统
 *
 * @author ivaneye
 * @since 2021-03-31 16:14:07
 */
public interface Software {

    void accept(Member member);

    void showSecurityArch();

    void showDevArch();

    void showSystemArch();

    void showProdArch();

    void showDeployArch();
}
