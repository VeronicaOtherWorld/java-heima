package q4_square_root;

import java.util.Scanner;

/*
* enter a int number that greater or equals to 2,
*  calculate and return the square of the number
*
* the result only has the integer, discarding the decimal part*/


/**
 * 1 * 1 = 1 < 10
 * 2 * 2 = 4 <10
 * 3 * 3 = 9 <10
 *4 * 4 = 16 >10
 * conclusion : the square root of 10 is between 3-4
 *
 * 4 * 4 = 16 <20
 *conclusion : the square root of 20 is between 4-5
 * 5 * 5 = 25 <30
 *
 *
 * conclusion
 * iteration start with 1(i),compare the number with the original number
 * if (i)root < number keep going
 * if root = number the number is root
 * if root > number The number that precedes this number is integer if the root
 * */
public class SquareRoot {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if(i * i == number) {
                System.out.println("i is " + i + " square root of " + number);
                break;
            } else if(i * i > number) {
                System.out.println("i is " + (i - 1) + " square root of " + number);
                break;
            }
        }
    }
}
