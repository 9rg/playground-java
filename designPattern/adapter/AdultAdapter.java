package designPattern.adapter;

public class AdultAdapter extends Adult implements Society {
    public AdultAdapter(String name) {
        super(name);
    }
    
    public void brunch(String food) {
        super.Eat(food);
    }

    public void reflesh(String play) {
        super.playSport(play);
    }
}