package designPattern.composite;

public class PaperTrush extends Entry {
    private String name;
    private int size;

    public PaperTrush(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void burn() {
        System.out.println(this.toString() + "を燃やしました");
    }
}