package Q8_Roman_numerals;

/*
* 15/12/2024
* */

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * I, II, III, IV, V, VI, VII, VIII, IX, and X
 * represent
 * 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10 respectively
 *
 * length: >= 9
 * only number
 * change into roman
 * no 0 in roman, if it has, change it to ""
 * */
public class RomanNumerals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] roman = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a int number: ");
        String number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            // - '0' turn the char to number
            sb.append(roman[number.charAt(i) - '0']);
        }
        System.out.println(sb.toString());
    }
}
