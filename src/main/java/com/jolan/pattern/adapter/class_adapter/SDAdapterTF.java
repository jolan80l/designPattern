package com.jolan.pattern.adapter.class_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 23:04
 * 适配器类
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
