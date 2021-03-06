package com.jolan.pattern.commond;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类，属于请求者类
 */
public class Waitor {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommands(Command cmd){
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发起命令功能
    public void orderUp(){
        System.out.println("美女服务员说：大厨，新订单来了。。。");
        for (Command command : commands){
            if(command != null){
                command.execute();
            }
        }
    }
}
