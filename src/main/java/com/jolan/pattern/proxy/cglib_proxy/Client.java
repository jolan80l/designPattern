package com.jolan.pattern.proxy.cglib_proxy;

/**
 * @author jolan80
 * @date 2021-12-09 22:32
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象中的sell方法
        proxyObject.sell();
    }
}
