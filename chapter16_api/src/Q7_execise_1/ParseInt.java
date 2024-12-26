package Q7_execise_1;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
    //     only have number
    //     1 or 10 numbers
    //     can not start with 0
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        boolean flag = false;
        while (!flag) {
            int newNum = 0;
            String s = in.nextLine();
            if (!s.matches("[1-9]\\d{0,9}")) {
                System.out.println("Not a number");
            } else {
                for (int i = 0; i < s.length(); i++) {
                    int digit = s.charAt(i) - '0';
                    System.out.println(digit);
                    newNum = newNum * 10 + digit;
                }
                System.out.println(newNum);
                flag = true;
            }
        }
    }
}
