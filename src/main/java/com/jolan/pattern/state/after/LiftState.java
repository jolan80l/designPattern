package com.jolan.pattern.state.after;

/**
 * 抽象状态类
 */
public abstract class LiftState {
    //生命环境角色变量
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //电梯开启操作
    public abstract void open();
    //电梯关闭操作
    public abstract void close();
    //电梯运行操作
    public abstract void run();
    //电梯停止操作
    public abstract void stop();
}
