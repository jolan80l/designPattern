package com.jolan.principles.demo2.before;

/**
 * 测试类
 */
public class RectagleDemo {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWith(rectangle);

        System.out.println("=============");
        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWith(square);
    }

    public static void resize(Rectangle rectangle){
        //判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWith(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}
