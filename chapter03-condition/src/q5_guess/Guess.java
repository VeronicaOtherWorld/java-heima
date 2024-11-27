package q5_guess;


import java.util.Random;
import java.util.Scanner;

// program creates a number randomly 1-100
// guess what is the number
public class Guess {
    public static void main(String[] args) {
        // double d = Math.random() * 101;
        // int i  = (int)d;
        int guess = 0, count = 0;
        boolean flag = false;
        Random r = new Random();
        int i = r.nextInt(100) + 1; // 0-100
        Scanner in = new Scanner(System.in);
        System.out.println(i);

        while (true) {
            if (count == 3) {
                System.out.println("you guessed it");
                break;
            }
            System.out.println("enter a number");
            guess = in.nextInt();
            count++;
            if (guess == i) {
                System.out.println("You guessed it");
                flag = true;
                break;
            } else if (guess > i) {
                System.out.println("Too big");
            } else if (guess < i) {
                System.out.println("Too small");
            }
        }
    }
}

class Randomn {
    Random r = new Random();
    // 7-15
    /*
    * 范围头尾各减1,范围从0开始 0-8
    * 尾巴——1 8+1 = 9
    * 外面加上减去的值 7
    * */
    int i2 = r.nextInt(9) + 7;
    int i = r.nextInt(101);
}
