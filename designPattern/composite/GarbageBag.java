package designPattern.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class GarbageBag extends Entry {
    private String name;
    private ArrayList bag = new ArrayList();

    public GarbageBag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        int size = 0;
        Iterator it = bag.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }

    public Entry add(Entry entry) {
        bag.add(entry);
        return this;
    }

    public void burn() {
        Iterator it = bag.iterator();
        System.out.println(name + "を燃やします");
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.burn();
        }
        System.out.println(name + "の中身を燃やしました");
    }
}