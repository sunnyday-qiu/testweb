package com.sunnyday.design.creator.singleton;

/**
 * Description: 饿汉模式
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
