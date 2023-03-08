package com.sunnyday.design.creator.singleton;

/**
 * Description: 利用enum 来实现单例
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public enum EnumSingleton {

    INSTANCE;

    public String doSomething() {
        return "method invoke...";
    }

}
