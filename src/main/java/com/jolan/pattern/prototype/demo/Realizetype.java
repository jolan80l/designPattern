package com.jolan.pattern.prototype.demo;

/**
 * @author jolan80
 * @date 2021-12-05 21:28
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
