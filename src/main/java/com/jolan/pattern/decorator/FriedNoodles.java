package com.jolan.pattern.decorator;

/**
 * @author jolan80
 * @date 2021-12-10 23:08
 * 炒面类，具体的构建角色
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles(){
        super(12, "炒面");
    }
    public float cost() {
        return getPrice();
    }
}
