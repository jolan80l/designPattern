package com.jolan.pattern.bridge;


/**
 * @author jolan80
 * @date 2021-12-11 21:46
 * Mac操作系统（扩展抽象化角色）
 */
public class Mac extends OpratingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
