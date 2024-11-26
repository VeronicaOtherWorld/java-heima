package q1_palinadrome;

import java.util.Scanner;
/*
* 提供一个整数
* 回文数数字,打印true,否则返回false
* 12321
* */
public class Palindrome {
    public static void main(String[] args) {
         int number, temp, newNum = 0;
         int digit = 0;
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         number = scanner.nextInt();
         temp = number;
         while (temp != 0) {

             //  e.g. 123
             //  123 % 10 = 3  123 / 10 = 12  0*10 + 3 = 3
            //  12 % 10 = 2    12 / 10 = 1    3*10 + 2 = 30 + 2 =32
            //  1 % 10 = 1     1 / 10 = 0     32*10 + 1 = 321
            //  get the unit number(last one)
            digit = temp % 10;
            // get rid of the last position number
             temp /= 10;
            // Add it up bit by bit
            newNum = newNum *10 + digit;
             System.out.println("The number " + number + "");
             System.out.println(newNum);
        }
         if (newNum == number) {
             System.out.println("The number " + number + " palinadrome");
         } else {
             System.out.println("The number " + number + " not palinadrome");
         }
    }
}