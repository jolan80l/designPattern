package com.jolan.pattern.prototype.demo;

/**
 * @author jolan80
 * @date 2021-12-05 21:30
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();
        //调用Realizetype类中的clone()方法进行克隆对象
        Realizetype clone = realizetype.clone();
        System.out.println("原型对象和克隆出来的对象是同一个对象？" + (realizetype == clone));

    }
}
