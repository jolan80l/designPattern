package com.jolan.principles.demo4.after;


public class Client {
    public static void main(String[] args) {
        //黑马安全门
        HeiMaSafetyDoor heiMaSafetyDoor = new HeiMaSafetyDoor();
        //调用功能
        heiMaSafetyDoor.antiTheft();
        heiMaSafetyDoor.fireproof();
        heiMaSafetyDoor.waterproof();

        System.out.println("============");

        ItcastSafetyDoor itcastSafetyDoor = new ItcastSafetyDoor();
        itcastSafetyDoor.antiTheft();
        itcastSafetyDoor.fireproof();
    }
}
