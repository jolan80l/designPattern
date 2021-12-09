package com.jolan.pattern.adapter.class_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 22:57
 * 适配者类
 */
public class TFCardImpl implements TFCard{
    public String readTF() {
        String msg = "TFCard read msg : hello world TFCard";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("TFCard write msg : " + msg);
    }
}
