package com.jolan.pattern.factory.abstract_factory;

/**
 * 美式风味甜品工厂，可以生产美式咖啡和抹茶慕斯
 */
public class AmericanDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
