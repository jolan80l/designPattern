package com.jolan.pattern.flyweight;


import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类，将该类设计为单例
 */
public class BoxFactory {
    private Map<String, AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<String, AbstractBox>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }

    private static BoxFactory factory = new BoxFactory();

    //根据名称获取图形
    public AbstractBox getShape(String name){
        return map.get(name);
    }


}
