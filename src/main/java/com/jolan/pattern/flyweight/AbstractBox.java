package com.jolan.pattern.flyweight;

/**
 * 抽象享元方法
 */
public abstract class AbstractBox {
    //获取图形方法
    public abstract String getShape();

    //展示图形及颜色
    public void display(String color){
        System.out.println("方块形状：" + getShape() + "颜色：" + color);
    }
}
