package com.jolan.pattern.factory.simple;

public class Client {
    public static void main(String[] args) {
        //创建coffee类
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        System.out.println(latte.getName());
    }
}
