package com.jolan.pattern.singleton.demo1;

/**
 * 饿汉式：静态成员变量
 */
public class Singleton {
    //私有构造方法
    private Singleton(){

    }

    //在本类中创建本类的对象
    private static Singleton instance = new Singleton();

    //一共一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}
