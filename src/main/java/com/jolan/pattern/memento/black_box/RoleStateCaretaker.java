package com.jolan.pattern.memento.black_box;

/**
 * @author jolan80
 * @date 2022-01-18 8:23
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    //声明备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        memento = memento;
    }
}
