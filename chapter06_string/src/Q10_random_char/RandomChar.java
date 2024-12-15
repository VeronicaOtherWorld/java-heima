package Q10_random_char;

import java.util.Random;
import java.util.Scanner;
/**
 * user enters a string, scramble the content
 * */

// to charArray
public class RandomChar {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = in.next();
        System.out.println(s);
        String[] letters = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            // int randomInt = r.nextInt(0,s.length());
            // System.out.println(randomInt);
            letters[i] = String.valueOf(s.charAt(i));
            // System.out.print(letters[i]);
        }
        for (int i = 0; i < letters.length; i++) {
            int randomInt = r.nextInt(0,s.length());
            // System.out.println(randomInt);
            letters[i] = String.valueOf(s.charAt(randomInt));
            System.out.print(letters[i]);
        }
    }
}
