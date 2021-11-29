package com.jolan.pattern.singleton.demo8;

import java.io.Serializable;

public class SingletonResolve implements Serializable {
    private static boolean flag = false;
    //私有构造方法
    private SingletonResolve(){
        synchronized (SingletonResolve.class){
            if(flag){
                throw new RuntimeException("不能创建SingletonResolve多个对象");
            }else{
                flag = true;
            }
        }
    }

    //定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final SingletonResolve INSTANCE = new SingletonResolve();
    }

    //提供公共的访问方式
    public static SingletonResolve getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
