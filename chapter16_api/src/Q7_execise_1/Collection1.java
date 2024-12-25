package Q7_execise_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection1 {
//     record some number from 1-100,add to collection
//     until the sum of the number > 200
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        while (sum < 200) {
            System.out.println("enter a number 1-100: ");
            int num = in.nextInt();
            if (num > 100 || num < 1) {
                System.out.println("note: enter a number 1-100 ");
                continue;
            } else {
                list.add(num);
                sum += num;
                System.out.println("sum = " + sum);
            }
        }
        System.out.println(list);

    }
}
