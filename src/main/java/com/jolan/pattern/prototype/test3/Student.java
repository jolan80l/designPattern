package com.jolan.pattern.prototype.test3;

import java.io.Serializable;

/**
 * @author jolan80
 * @date 2021-12-05 21:44
 */
//学生类
public class Student implements Serializable {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}