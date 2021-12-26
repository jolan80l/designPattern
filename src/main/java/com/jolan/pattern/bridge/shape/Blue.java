package com.jolan.pattern.bridge.shape;

public class Blue implements Color{
    @Override
    public void draw() {
        System.out.println("画蓝色");
    }
}
