package q3_pass_seven;

import java.util.Scanner;

// from an any number start counting off
/*
* when then number is 7 or contains 7, or a multiple of 7, output:pass
*
* */
public class PassSeven {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        number = sc.nextInt();
        while (number <= 100) {
            // equal 7; multiple of 7; single digit is 7;  tens of digits is 7
            if(number == 7 || number % 7 == 0 || number % 10 == 7 || number / 10 % 10 == 7) {
                System.out.println("number is " + number + " pass");
                number++;
            } else {
                number++;
            }
        }
    }
}
