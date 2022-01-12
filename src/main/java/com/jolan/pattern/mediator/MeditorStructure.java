package com.jolan.pattern.mediator;

/**
 * 具体的中介者角色
 */
public class MeditorStructure extends Meditor{
    //聚合房主和租房者
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constract(String message, Person persion) {
        if(persion == houseOwner){
            tenant.getMessage(message);
        }else if(persion == tenant){
            houseOwner.getMessage(message);
        }
    }
}
