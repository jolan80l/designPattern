package com.jolan.pattern.visitor;

/**
 * 具体元素角色：宠物狗
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);//访问者给宠物猫喂食
        System.out.println("好好吃，汪~~~");
    }
}
