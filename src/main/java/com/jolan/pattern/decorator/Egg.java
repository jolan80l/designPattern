package com.jolan.pattern.decorator;

/**
 * @author jolan80
 * @date 2021-12-10 23:12
 * 鸡蛋类，具体的装饰者类
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
