package com.jolan.pattern.adapter.object_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 23:04
 * 适配器类
 */
public class SDAdapterTF implements SDCard {

    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
