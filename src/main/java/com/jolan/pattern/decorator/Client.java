package com.jolan.pattern.decorator;

/**
 * @author jolan80
 * @date 2021-12-10 23:14
 */
public class Client {
    public static void main(String[] args) {
        //点炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===========");

        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===========");

        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");

        System.out.println("===========");

        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}
