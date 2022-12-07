package com.sunnyday.design.singleton;

/**
 * Description: spring 使用的双重锁
 *
 * @author sunnyday
 * @date 2022/11/14
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    /**
     * 这里还需要加锁吗？好像不用了吧
     */
    public static synchronized DoubleCheckSingleton getInstance() {
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
