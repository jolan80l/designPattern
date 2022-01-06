package com.jolan.pattern.template;

import com.jolan.pattern.flyweight.AbstractBox;

public class Client {
    public static void main(String[] args) {
        //炒包菜
        ConcreteClass_BaoCai baocai = new ConcreteClass_BaoCai();
        //调用炒菜的功能
        baocai.cookProcess();
    }
}
