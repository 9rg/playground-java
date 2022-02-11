package designPattern.singleton;

public class PrimeNumberGenerator {
    private static PrimeNumberGenerator singleton = new PrimeNumberGenerator();
    private int primeNumber = 2;

    private PrimeNumberGenerator(){
    }

    public static PrimeNumberGenerator getInstance() {
        return singleton;
    }
    
    public int getPrimeNumber() {
        while (true) {
            boolean isPrimeNumber = true;
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                return primeNumber++;
            } else {
                primeNumber++;
            }
        }
    }
}