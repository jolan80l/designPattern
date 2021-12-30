package com.jolan.pattern.combination;

/**
 * 属于抽象根节点
 */
public abstract class MenuCompoent {
    //菜单组件的名称
    protected String name;
    //菜单组件的层级
    protected int level;
    //添加子菜单
    public void add(MenuCompoent menuCompoent){
        throw new UnsupportedOperationException();
    }
    //移除子菜单
    public void remove(MenuCompoent menuCompoent){
        throw new UnsupportedOperationException();
    }

    public MenuCompoent getChild(int index){
        throw new UnsupportedOperationException();
    }

    //获取菜单或者菜单项的名称
    public String getName(){
        return name;
    }

    //打印菜单名称(包含子菜单和子菜单项 )
    public abstract void print();
}
