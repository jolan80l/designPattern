package com.jolan.pattern.commond;

public class Client {
    public static void main(String[] args) {
        //创建第一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小杯可乐", 2);
        //创建第二个订单对象
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);

        //创建厨师对象
        SeiniorChef receiver = new SeiniorChef();
        //创建命令对象
        OrderCommond cmd1 = new OrderCommond(receiver, order1);
        OrderCommond cmd2 = new OrderCommond(receiver, order2);

        //创建调用者（服务员对象）
        Waitor waitor = new Waitor();
        waitor.setCommands(cmd1);
        waitor.setCommands(cmd2);
        waitor.orderUp();


    }
}
