package com.jolan.pattern.mediator;

/**
 * 抽象同事类
 */
public abstract class Person {
    protected String name;
    protected Meditor meditor;

    public Person(String name, Meditor meditor) {
        this.name = name;
        this.meditor = meditor;
    }
}
