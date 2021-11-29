package com.jolan.pattern.factory.abstract_factory;

/**
 * 意大利风味甜品工程，生产拿铁咖啡和提拉米苏甜品
 */
public class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
