package com.jolan.pattern.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore coffeeStore = new CoffeeStore();
        //创建对象
        CoffeeFactory coffeeFactory  = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        //点咖啡
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
