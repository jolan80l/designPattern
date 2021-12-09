package com.jolan.pattern.proxy.jdk_proxy;

//测试类
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());
    }
}