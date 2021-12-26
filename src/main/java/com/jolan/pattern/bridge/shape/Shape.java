package com.jolan.pattern.bridge.shape;

public abstract class Shape {
    protected Color color;


    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawPicture();
}
