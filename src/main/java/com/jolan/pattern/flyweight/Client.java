package com.jolan.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");
        //获取L图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("L");
        box2.display("黄色");
        //获取O图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("紫色");
        //获取O图形对象
        AbstractBox box4 = BoxFactory.getInstance().getShape("O");
        box3.display("红色");

        System.out.println(box3 == box4);

    }
}
