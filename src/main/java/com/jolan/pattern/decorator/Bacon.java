package com.jolan.pattern.decorator;

/**
 * @author jolan80
 * @date 2021-12-10 23:12
 * 培根类，具体的装饰者类
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
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
