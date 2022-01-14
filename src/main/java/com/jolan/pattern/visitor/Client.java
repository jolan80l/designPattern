package com.jolan.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        //添加元素到home对象中
        home.add(new Dog());
        home.add(new Cat());

        //创建主人
        Owner owner = new Owner();
        //让主人喂食所有的宠物
        home.action(owner);

    }
}
