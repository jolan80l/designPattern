package com.jolan.pattern.singleton.demo2;

/**
 * 饿汉式：静态代码块
 */
public class Singleton {
    //私有构造方法
    private Singleton(){

    }

    //生命Singleton类型的变量
    private static Singleton instance;

    //在静态代码块赋值
    static {
        instance = new Singleton();
    }

    //对外提供获取对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
