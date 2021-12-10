package com.jolan.pattern.adapter.object_adapter;

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
        //创建适配器类对象
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
