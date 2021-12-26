package com.jolan.pattern.bridge.shape;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void drawPicture() {
        color.draw();
        System.out.println("正方形");
        System.out.println("===========");
    }
}
