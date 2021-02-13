package com.ivaneye.singleton;

/**
 * 懒汉式
 */
public final class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
        if (instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
