package com.jolan.pattern.bridge;

/**
 * @author jolan80
 * @date 2021-12-11 21:40
 * avi视频，具体的实现化角色
 */
public class AviFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
