package com.ivaneye.visitor;

/**
 * @author ivaneye
 * @since 2021-03-31 16:17:00
 */
public class Product implements Member {

    @Override
    public void view(Software software) {
        software.showProdArch();
    }
}
