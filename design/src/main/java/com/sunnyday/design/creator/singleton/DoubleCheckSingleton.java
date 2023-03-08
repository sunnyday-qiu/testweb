package com.sunnyday.design.creator.singleton;

/**
 * Description: spring 使用的双重锁
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class DoubleCheckSingleton {

    /**
     * 使用了volatile 关键字
     */
    private static volatile DoubleCheckSingleton instance;

    /**
     * 私有化的构造函数，外部只能通过指定方法获取到实例对象
     */
    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
