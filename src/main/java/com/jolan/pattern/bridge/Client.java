package com.jolan.pattern.bridge;

/**
 * @author jolan80
 * @date 2021-12-11 21:47
 */
public class Client {
    public static void main(String[] args) {
        //创建Mac系统对象
        OpratingSystem opratingSystem = new Mac(new AviFile());
        //使用操作系统播放视频文件
        opratingSystem.play("战狼3");
    }
}
