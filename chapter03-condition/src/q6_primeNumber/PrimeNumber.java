package q6_primeNumber;

import java.util.Scanner;

/*
* enter a prime number
* receive the keystroke from keyboard, a positive integer
* determine if it is a prime number
* */

/*
* 质数 是一个 大于 1 的自然数，并且 只能被 1 和它本身整除。
* 换句话说，它只有两个正因数：1 和它本身。 7 only can be divide by itself
* only is itself and 1
* */
public class PrimeNumber {
    public static void main(String[] args) {
        int x = 0;
        boolean primeFlag = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = in.nextInt();
        // iterate a seires of number, start from 2
        // if the x can be divided by any number
        // it is not a prime number
        for (int i = 2; i < x; i++) {
            // i represent each number
            if(x % i == 0) {
                System.out.println("it is not a prime number");
                primeFlag = false;
                break;
            }
        }
        //     only when the loop finished, finally we can know if
        //     it is a prime number
        if (primeFlag) {
            System.out.println("it is a prime number");
        }
    }
}
