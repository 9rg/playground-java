package designPattern.adapter;

public class Main {
    public static void main(String[] args) {
        Society salaryMan = new AdultAdapter("taro");

        salaryMan.brunch("sandwitch");
        salaryMan.reflesh("golf");
    }
}