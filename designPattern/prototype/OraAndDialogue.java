package designPattern.prototype;

import designPattern.prototype.framework.Product;

public class OraAndDialogue implements Product{
    private String oraFrase;

    public OraAndDialogue(String oraFrase) {
        this.oraFrase = oraFrase;
    }

    public void use(String s) {
        System.out.println("~Excution Music~");
        for (int i = 0; i < 20; i++) {
            System.out.print(oraFrase);
        }
        System.out.println(oraFrase + "!!!!!!");
        System.out.println(s + "\n");
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