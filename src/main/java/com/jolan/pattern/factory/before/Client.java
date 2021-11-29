package com.jolan.pattern.factory.before;

public class Client {
    public static void main(String[] args) {
        //1.创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        //2.点咖啡
        Coffee coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());

        //3.点咖啡
        Coffee coffee2 = coffeeStore.orderCoffee("American");
        System.out.println(coffee2.getName());
    }
}
