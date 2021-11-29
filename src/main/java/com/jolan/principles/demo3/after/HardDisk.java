package com.jolan.principles.demo3.after;

/**
 * 硬盘接口
 */
public interface HardDisk {
    //存储数据
    public void save(String data);
    //获取数据的方法
    public String get();
}
