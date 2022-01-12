package com.jolan.pattern.observer;

public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //订阅公众号
        subject.attach(new WeixinUser("孙悟空"));
        subject.attach(new WeixinUser("猪悟能"));
        subject.attach(new WeixinUser("沙悟净"));
        //公众号更新，发出消息给订阅者（观察者）
        subject.notify("经书更新了");
    }
}
