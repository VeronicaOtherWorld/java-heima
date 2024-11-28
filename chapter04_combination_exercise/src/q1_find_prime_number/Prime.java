package q1_find_prime_number;


/*
* find all the prime number from 101 to 200
* output them
* */

/*
 * 质数 是一个 大于 1 的自然数，并且 只能被 1 和它本身整除。
 * 换句话说，它只有两个正因数：1 和它本身。 7 only can be divide by itself
 * only is itself and 1
 * */

public class Prime {
    public static void main(String[] args) {
        int[] arr = new int[101];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 100 + i;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr.length; j++) {
                if(arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(arr[i] + " is prime");
            } else {
                System.out.println("not prime");
            }
        }
        System.out.println(count);
    }
}
