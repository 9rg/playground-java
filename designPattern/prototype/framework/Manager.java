package designPattern.prototype.framework;

import java.util.HashMap;

import javax.sound.sampled.Port;

public class Manager {
    // hash map that holds prototype of classes
    private HashMap showcase = new HashMap();

    // to regist protorype class to showcase with protoname
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    // to make clone class from showcase
    public Product create(String protoname) {
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}