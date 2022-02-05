package designPattern.factoryMethod;

import designPattern.factoryMethod.framework.*;
import designPattern.factoryMethod.medicine.*;

public class Main {
    public static void main(String[] args) {
        Factory f = new MedicineFactory();
        Product medicine1 =  f.create("taro");
        Product medicine2 =  f.create("jiro");
        Product medicine3 =  f.create("saburo");
        medicine1.use();
        medicine2.use();
        medicine3.use();    
    }
}