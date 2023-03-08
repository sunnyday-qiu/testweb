package com.sunnyday.design.creator.singleton;

/**
 * Description: 懒汉
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    /**
     * 这里需要加锁避免重复创建
     */
    public static synchronized LazySingleton getInstance() {
        return instance == null ? new LazySingleton() : instance;
    }

}
