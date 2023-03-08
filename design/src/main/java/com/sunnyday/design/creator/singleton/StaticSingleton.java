package com.sunnyday.design.singleton;

/**
 * Description: 利用java 静态类加载来实例化
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class StaticSingleton {

    private static class StaticSingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {}

    public static StaticSingleton getInstance() {
        return StaticSingletonHolder.INSTANCE;
    }
}
