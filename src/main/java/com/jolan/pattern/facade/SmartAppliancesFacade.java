package com.jolan.pattern.facade;

/**
 * 外观类
 * 用户主要和该类进行交互
 */
public class SmartAppliancesFacade {
    //聚合电灯对象、电视机对象、空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    //通过语音控制
    public void say(String message){
        if(message.contains("打开")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else{
            System.out.println("我还听不懂你说的");
        }
    }

    //一键打开
    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }
    //一键关闭
    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
