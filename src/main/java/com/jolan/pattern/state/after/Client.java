package com.jolan.pattern.state.after;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        //设置当前电梯状态
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
