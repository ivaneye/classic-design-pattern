package com.ivaneye.singleton;

/**
 * 基于静态内部类的单例
 */
public final class HolderSingleton {

  /**
   * 设置构造方法为私有
   */
  private HolderSingleton() {
  }

  public static HolderSingleton getInstance() {
    return HelperHolder.INSTANCE;
  }

  private static class HelperHolder {
    private static final HolderSingleton INSTANCE =
        new HolderSingleton();
  }
}
