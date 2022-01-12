package com.jolan.pattern.mediator;

/**
 * 具体的同事角色类
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Meditor meditor) {
        super(name, meditor);
    }

    //和中介联系
    public void constact(String message){
        meditor.constract(message, this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息是" + message);
    }
}
