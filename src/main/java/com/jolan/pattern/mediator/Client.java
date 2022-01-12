package com.jolan.pattern.mediator;

import javax.net.ssl.HostnameVerifier;

public class Client {
    public static void main(String[] args) {
        //创建中介者对象
        MeditorStructure meditorStructure = new MeditorStructure();
        //创建租房者对象
        Tenant tenant = new Tenant("李四", meditorStructure);
        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", meditorStructure);

        //中介者要知道具体的房主和租房者
        meditorStructure.setTenant(tenant);
        meditorStructure.setHouseOwner(houseOwner);

        tenant.constact("我要租三室一厅的房子");
        houseOwner.constact("我这里有三室一厅房租，你要租么？");
    }
}
