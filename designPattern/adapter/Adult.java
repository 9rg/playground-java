package designPattern.adapter;

public class Adult {
    private String name;

    public Adult(String name) {
        this.name = name;
    }

    public void Eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    public void playSport(String sport) {
        System.out.println(name + " plays " + sport + ".");
    }
}