package com.jolan.pattern.mediator;


/**
 * 具体同事角类
 */
public class Tenant extends Person {
    public Tenant(String name, Meditor meditor) {
        super(name, meditor);
    }

    //和中介联系
    public void constact(String message){
        meditor.constract(message, this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("租房者" + name + "获取到的信息是" + message);
    }
}
