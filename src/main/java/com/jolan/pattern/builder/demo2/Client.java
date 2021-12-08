package com.jolan.pattern.builder.demo2;

/**
 * @author jolan80
 * @date 2021-12-08 23:29
 */
public class Client {
    public static void main(String[] args) {
        //通过构建者对象获取手机对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainboard("华硕")
                .build();

        System.out.println(phone.toString());
    }
}
