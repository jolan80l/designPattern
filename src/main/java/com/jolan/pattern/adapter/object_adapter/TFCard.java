package com.jolan.pattern.adapter.object_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 22:55
 * 适配者类接口
 */
public interface TFCard {
    //从TF卡读取数据
    String readTF();
    //往TF卡写数据
    void writeTF(String msg);
}
