package com.jolan.pattern.bridge.shape;

public class Red implements Color{
    @Override
    public void draw() {
        System.out.println("画红色");
    }
}
