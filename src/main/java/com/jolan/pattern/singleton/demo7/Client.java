package com.jolan.pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试使用序列号反序列化破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        //writeObjectToFile();
        readObjectFromFile();
        readObjectFromFile();
    }

    //向文件写数据（对象）
    public static void writeObjectToFile() throws Exception{
        //获取instance
        Singleton instance = Singleton.getInstance();
        //创建对象输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("demo7.SingletonObject.txt"));
        //写对象
        outputStream.writeObject(instance);
        outputStream.close();
    }
    //从文件读数据（对象）
    public static void readObjectFromFile() throws Exception {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo7.SingletonObject.txt"));
        //读取对象
        Singleton instance = (Singleton)ois.readObject();
        System.out.println(instance);
        //释放资源
        ois.close();

    }
}
