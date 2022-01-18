package com.jolan.pattern.memento.white_box;

/**
 * @author jolan80
 * @date 2022-01-18 8:23
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    //声明备忘录对象
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
