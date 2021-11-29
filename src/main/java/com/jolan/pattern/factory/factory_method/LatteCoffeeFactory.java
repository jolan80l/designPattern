package com.jolan.pattern.factory.factory_method;

/**
 * 拿铁咖啡工厂，专门生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
