package com.jolan.pattern.adapter.class_adapter;

/**
 * @author jolan80
 * @date 2021-12-09 22:58
 * 目标接口
 */
public interface SDCard {
    //从SD卡中读取数据
    String readSD();
    //往SD卡中写数据
    void writeSD(String msg);
}
