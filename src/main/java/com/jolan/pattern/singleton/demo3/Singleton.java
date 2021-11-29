package com.jolan.pattern.singleton.demo3;

/**
 * 懒汉式1：线程不安全
 */
public class Singleton {
    //私有构造方法
    private Singleton(){

    }

    //声明Singleton变量
    private static Singleton instance;

    //对外界提供访问方式
    public static Singleton getInstance(){
        //判断instance是否为空，如果为null，说明还没有创建instance对象
        //如果没有，创建一个并返回，如果有直接返回
        /**
         * 线程不安全说明：线程A判断instance为null，然后进入判断中尚未执行
         *                此时线程B也判断instance是否为null，然后进入判断中执行
         *                此时线程A获取到执行权，继续执行，则线程A和线程B创建了两个实例
         */
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
