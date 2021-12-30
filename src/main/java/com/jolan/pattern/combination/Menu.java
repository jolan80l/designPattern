package com.jolan.pattern.combination;

import com.sun.org.apache.xerces.internal.impl.dtd.XMLEntityDecl;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类
 */
public class Menu extends MenuCompoent{

    //菜单可以有多个菜单或子菜单项
    private List<MenuCompoent> menuCompoentList = new ArrayList<MenuCompoent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuCompoent menuCompoent) {
        menuCompoentList.add(menuCompoent);
    }

    @Override
    public void remove(MenuCompoent menuCompoent) {
        menuCompoentList.remove(menuCompoent);
    }

    @Override
    public MenuCompoent getChild(int index) {
        return menuCompoentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 0 ; i < level ; i++){
            System.out.print("--");
        }
        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        for (MenuCompoent menuCompoent : menuCompoentList) {
            menuCompoent.print();
        }
    }
}
