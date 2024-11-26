package q2_quotientnremainder;


import java.util.Scanner;

/*
* 给定两个整数,被除数和除数,都是正数 int
* 两数相除,不用乘法,不用除法和 %
* 得到商和余数
*
*  dividend / divisor = quotient... remainder
*
* dividend = dividend - divisor;
* */
public class Quotient {
    public static void main(String[] args) {
        int dividend, divisor, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        dividend = sc.nextInt();
        System.out.println("Enter the second number: ");
        divisor = sc.nextInt();
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println(" 余数 " + dividend);
        System.out.println("count ⬆️ " + count);
    }
}
