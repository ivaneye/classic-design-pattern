package com.ivaneye.abstractfactory;

/**
 * 抽象工厂
 *
 * @author ivaneye
 * @since 2021-02-19 16:26:09
 */
public interface SystemFactory {

    IO createIO();

    RAM createRAM();
}
