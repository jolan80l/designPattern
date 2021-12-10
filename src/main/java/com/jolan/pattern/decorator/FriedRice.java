package com.jolan.pattern.decorator;

import java.security.Principal;

/**
 * @author jolan80
 * @date 2021-12-10 23:06
 * 炒饭，具体构建角色
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10, "炒饭");
    }

    public float cost() {
        return getPrice();
    }
}
