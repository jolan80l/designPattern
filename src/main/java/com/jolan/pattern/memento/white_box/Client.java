package com.jolan.pattern.memento.white_box;

/**
 * @author jolan80
 * @date 2022-01-18 8:24
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--------------大战BOSS前--------------");


        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        //初始状态操作
        gameRole.intState();
        gameRole.stateDisplay();

        //将该游戏角色内部状态备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("--------------大战BOSS后----------------");

        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("------------恢复到之前的状态-------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());

        gameRole.stateDisplay();

    }
}
