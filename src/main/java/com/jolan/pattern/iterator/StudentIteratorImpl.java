package com.jolan.pattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    //用来存放遍历的位置
    private int position = 0;
    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student student = list.get(position);
        position++;
        return student;
    }

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }
}
