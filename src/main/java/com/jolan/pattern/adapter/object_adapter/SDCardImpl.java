package com.jolan.pattern.adapter.object_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 22:59
 * 具体的SD卡类
 */
public class SDCardImpl implements SDCard {
    public String readSD() {
        String msg = "SDCard read msg : hello world SDCard";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
