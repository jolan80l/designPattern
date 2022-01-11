package com.jolan.pattern.state.before;

public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        //设置当前电梯的状态
        lift.setState(ILift.OPENING_STATE);

        //开门
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
