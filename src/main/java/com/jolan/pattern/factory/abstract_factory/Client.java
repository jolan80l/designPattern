package com.jolan.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //创建的是意大利风味甜品工厂对象
        ItalyDessertFactory italyDessertFactory = new ItalyDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

        //创建的是意大利风味甜品工厂对象
        AmericanDessertFactory americanDessertFactory = new AmericanDessertFactory();
        //获取拿铁咖啡和提拉米苏甜品
        Coffee coffee2 = americanDessertFactory.createCoffee();
        Dessert dessert2 = americanDessertFactory.createDessert();
        System.out.println(coffee2.getName());
        dessert2.show();



    }
}
