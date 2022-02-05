package designPattern.factoryMethod.medicine;

import designPattern.factoryMethod.framework.*;

public class Medicine extends Product {
    private String owner;

    public Medicine(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void use() {
        System.out.println(owner + " takes " + "mecine.");
    }
}