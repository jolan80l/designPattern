package com.jolan.pattern.decorator;

/**
 * @author jolan80
 * @date 2021-12-10 23:09
 * 装饰者类，抽象装饰者角色
 */
public abstract class Garnish extends FastFood{
    //生命快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
