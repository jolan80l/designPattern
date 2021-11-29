package com.jolan.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 测试使用反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //获取Singleton的字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        //获取无参构造方法
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        //取消访问检查
        declaredConstructor.setAccessible(true);
        //创建Singleton对象
        Singleton singleton1 = declaredConstructor.newInstance();
        Singleton singleton2 = declaredConstructor.newInstance();

        System.out.println(singleton1 == singleton2);

        System.out.println("================");

        //获取Singleton的字节码对象
        Class<SingletonResolve> singletonClass2 = SingletonResolve.class;
        //获取无参构造方法
        Constructor<SingletonResolve> declaredConstructor2 = singletonClass2.getDeclaredConstructor();
        //取消访问检查
        declaredConstructor2.setAccessible(true);
        //创建Singleton对象
        SingletonResolve singleton3 = declaredConstructor2.newInstance();
        SingletonResolve singleton4 = declaredConstructor2.newInstance();

        System.out.println(singleton3 == singleton4);
    }
}
