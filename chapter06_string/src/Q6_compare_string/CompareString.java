package Q6_compare_string;

import java.util.Scanner;

/**
 * compare a word if equals to the reversed itself
 * */
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.next();
        String newStr = new StringBuilder(s).reverse().toString();
        System.out.println("New string: " + newStr);
        System.out.println("Compare String: " + s);
        if (newStr.equals(s)) {
            System.out.println("The string is equal");
        } else {
            System.out.println("not equal");
        }

    }
}
