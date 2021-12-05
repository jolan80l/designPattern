package com.jolan.pattern.prototype.test;

/**
 * @author jolan80
 * @date 2021-12-05 21:40
 */
//奖状类
public class Citation implements Cloneable {
    //三好学生姓名
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return (this.name);
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
