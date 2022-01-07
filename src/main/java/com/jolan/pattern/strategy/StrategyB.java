package com.jolan.pattern.strategy;

/**
 * 具体策略类B
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("买200减50");
    }
}
