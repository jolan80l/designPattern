package com.jolan.pattern.factory.factory_method;

/**
 * 美式咖啡工厂对象
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
