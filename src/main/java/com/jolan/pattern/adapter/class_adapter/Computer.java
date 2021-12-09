package com.jolan.pattern.adapter.class_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 23:00
 * 计算机类
 */
public class Computer {
    //从SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new NullPointerException("sdCard is not null");
        }
        return sdCard.readSD();
    }
}
