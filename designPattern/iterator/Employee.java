package designPattern.iterator;

public class Employee {
    private String name;
    private int age;
    private String post;

    public Employee(String name, int age, String post) {
        this.name = name;
        this.age = age;
        this.post = post;
    }
    
    @Override
    public String toString() {
        return "name:" + name + " age:" + age + " post:" + post;
    }
}