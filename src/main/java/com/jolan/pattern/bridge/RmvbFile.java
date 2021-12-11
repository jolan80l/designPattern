package com.jolan.pattern.bridge;

/**
 * @author jolan80
 * @date 2021-12-11 21:41
 * Rmvb视频文件，具体的实现化角色
 */
public class RmvbFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
