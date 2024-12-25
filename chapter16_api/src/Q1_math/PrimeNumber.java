package Q1_math;

// the prime number
public class PrimeNumber {
    public static void main(String[] args) {
        isPrime(4);

    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            System.out.println("n is less than 1");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return false;
            }
        }
        System.out.println(n + " is a prime number");
        return true;
    }
}
