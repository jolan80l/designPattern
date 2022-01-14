package com.jolan.pattern.iterator;

/**
 * 抽象迭代器角色
 */
public interface StudentIterator {
    //半盘是否有下一个元素
    boolean hasNext();
    //获取下一个元素
    Student next();
}
