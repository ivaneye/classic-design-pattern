package com.ivaneye.singleton;

/**
 * 基于枚举的单例
 */
public enum EnumSingleton {

  INSTANCE;

  @Override
  public String toString() {
    return getDeclaringClass().getCanonicalName() + "@" + hashCode();
  }
}
