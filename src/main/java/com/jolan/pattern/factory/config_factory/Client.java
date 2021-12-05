package com.jolan.pattern.factory.config_factory;

/**
 * @author jolan80
 * @date 2021-12-05 21:14
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());

        System.out.println("========");

        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
