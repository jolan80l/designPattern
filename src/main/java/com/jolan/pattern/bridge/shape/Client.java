package com.jolan.pattern.bridge.shape;

public class Client {
    public static void main(String[] args) {
        Red red = new Red();
        Shape square = new Square(red);
        square.drawPicture();
    }
}
