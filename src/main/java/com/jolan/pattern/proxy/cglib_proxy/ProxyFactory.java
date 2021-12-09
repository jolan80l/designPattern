package com.jolan.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author jolan80
 * @date 2021-12-09 22:28
 * 获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    //声明火车站对象
    private TrainStation trainStation = new TrainStation();
    public TrainStation getProxyObject(){
        //创建Enhancer对象。类似JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation trainStation = (TrainStation)enhancer.create();
        return trainStation;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //System.out.println("方法执行了");
        System.out.println("cglib代理收取费用");
        Object obj = method.invoke(trainStation, objects);
        return obj;
    }
}
