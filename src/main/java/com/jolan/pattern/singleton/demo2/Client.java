package com.jolan.pattern.singleton.demo2;


public class Client {
    public static void main(String[] args) {
        //创建Singleton对象
        Singleton singleton = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();

        //判断两个对象是否是一个
        System.out.println(singleton == instance);

    }
}
