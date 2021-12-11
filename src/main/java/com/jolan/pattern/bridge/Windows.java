package com.jolan.pattern.bridge;

/**
 * @author jolan80
 * @date 2021-12-11 21:45
 * 扩展抽象化角色（windows操作系统）
 */
public class Windows extends OpratingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
