package com.jolan.principles.demo3.after;

public class ComputerDemo {
    public static void main(String[] args) {
        //创建计算机对象
        Computer c = new Computer();

        //创建计算机的组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        //组装
        c.setHardDisk(hardDisk);
        c.setCpu(cpu);
        c.setMemory(memory);

        c.run();
    }
}
