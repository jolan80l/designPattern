package com.jolan.pattern.visitor;

/**
 * 抽象访问的角色类
 */
public interface Person {
    //喂食宠物猫
    void feed(Cat cat);
    //喂食宠物狗
    void feed(Dog dog);
}
