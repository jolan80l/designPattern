package com.jolan.pattern.adapter.class_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 23:02
 */
public class Client {
    public static void main(String[] args) {
        //创建电脑类
        Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("--------------------");
        //使用该电脑读取TF卡中的数据
        //定义适配器类
        String msg2 = computer.readSD(new SDAdapterTF());
        System.out.println(msg2);
    }
}
