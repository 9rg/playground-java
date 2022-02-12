package designPattern.prototype;

import designPattern.prototype.framework.Product;

public class gggAndDialogue implements Product {
    private String gggFrase;

    public gggAndDialogue(String gggFrase) {
        this.gggFrase = gggFrase;
    }

    public void use(String s) {
        for (int i = 0; i < 10; i++) {
            System.out.print(gggFrase);
        }
        System.out.println("...");
        System.out.println(s);
        System.out.print("     ");
        for (int i = 0; i < 10; i++) {
            System.out.print(gggFrase);
        }
        System.out.println("\n");
    }

    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}