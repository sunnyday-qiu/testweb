package com.sunnyday.design.singleton;

/**
 * Description: 饿汉模式
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = new LazySingleton();

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return INSTANCE;
    }
}
