package com.jolan.pattern.strategy;

/**
 * 具体策略类A
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
