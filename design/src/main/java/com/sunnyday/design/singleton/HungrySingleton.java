package com.sunnyday.design.singleton;

/**
 * Description: 懒汉模式
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class HungrySingleton {

    private static HungrySingleton instance;

    private HungrySingleton() {
    }

    /**
     * 这里需要加锁避免重复创建
     */
    public static synchronized HungrySingleton getInstance() {
        return instance == null ? new HungrySingleton() : instance;
    }

}
