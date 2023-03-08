package com.sunnyday.design.prototype;

/**
 * 深拷贝与浅拷贝
 *
 * 基本数据类型直接拷贝
 *
 * 引用数据类型还是原来的引用，只用实现了Cloneable接口并复写了clone方法的对象才是深拷贝
 */
public class Prototype implements Cloneable {

    private String name;

    private int gae;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
