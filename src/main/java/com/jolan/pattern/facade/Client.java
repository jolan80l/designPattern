package com.jolan.pattern.facade;

public class Client {
    public static void main(String[] args) {
        //创建智能音响对象
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        System.out.println("---------------------");
        smartAppliancesFacade.say("关闭家电");
    }
}
