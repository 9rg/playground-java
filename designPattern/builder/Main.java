package designPattern.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new QueryBuilder();
        Director director = new Director(builder);

        director.construct();

        System.out.println("Query=");
        System.out.println(((QueryBuilder) builder).getResult());
    }
}