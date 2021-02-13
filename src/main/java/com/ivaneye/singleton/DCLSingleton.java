package com.ivaneye.singleton;

/**
 * Double Check lock
 */
public final class DCLSingleton {

  private static volatile DCLSingleton instance;

  private static boolean flag = true;

  /**
   * 设置构造方法为私有
   */
  private DCLSingleton() {
    if (flag) {
      flag = false;
    } else {
      throw new IllegalStateException("Already initialized.");
    }
  }

  public static DCLSingleton getInstance() {
    DCLSingleton result = instance;
    if (result == null) {
      synchronized (DCLSingleton.class) {
        result = instance;
        if (result == null) {
          instance = result = new DCLSingleton();
        }
      }
    }
    return result;
  }
}
