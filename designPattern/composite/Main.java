package designPattern.composite;

public class Main {
    public static void main(String[] args) {
        GarbageBag bag1 = new GarbageBag("ポリ袋");
        GarbageBag bag2 = new GarbageBag("大きいゴミ袋");

        bag1.add(new PaperTrush("はなかみティッシュ1", 1));
        bag1.add(new PaperTrush("はなかみティッシュ2", 2));
        bag2.add(new PaperTrush("段ボール", 3));
        bag2.add(new PaperTrush("空き箱", 2));
        bag2.add(bag1);

        bag2.burn();
    }
}