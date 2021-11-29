package com.jolan.principles.demo4.before;

/**
 * 黑马防盗门
 */
public class HeimaSafetyDoor implements SafetyDoor{
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
