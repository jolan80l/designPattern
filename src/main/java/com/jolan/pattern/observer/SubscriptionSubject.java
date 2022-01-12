package com.jolan.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */
public class SubscriptionSubject implements Subject {
    //定义一个集合用来存储多个观察者对象
    private List<Observer> weixinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : weixinUserList){
            //调用观察者中的update方法
            observer.update(message);
        }
    }
}
