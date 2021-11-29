package com.jolan.principles.demo3.before;

/**
 * 希捷硬盘类
 */
public class XiJieHardDisk {

    /**
     * 存储数据的方法
     * @param data
     */
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据" + data);
    }

    /**
     * 获取数据的方法
     * @return
     */
    public String get() {
        System.out.println("使用希捷希捷硬盘取数据");
        return "数据";
    }
}