package com.jolan.pattern.singleton.demo4;

/**
 * 懒汉式：双重检查锁
 */
public class Singleton {
    //私有构造方法
    private Singleton(){

    }

    //声明Singleton变量,用volatile禁止指令重排序
    private static volatile Singleton instance;

    //对外界提供访问方式
    public static Singleton getInstance(){
        //第一次判断，如果instance不为null，不需要抢占锁，直接返回
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
