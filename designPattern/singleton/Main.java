package designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        PrimeNumberGenerator obj1 = PrimeNumberGenerator.getInstance();
        PrimeNumberGenerator obj2 = PrimeNumberGenerator.getInstance();
        
        System.out.println("# use obj1.");
        for (int i = 0; i < 10; i++) {
            System.out.println("prime number[" + i + "] = " + obj1.getPrimeNumber());
        }

        System.out.println("# use obj2.");
        for (int i = 0; i < 10; i++) {
            System.out.println("prime number[" + i + "] = " + obj2.getPrimeNumber());
        }
    }
}