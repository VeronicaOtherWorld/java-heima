package q3_sing_compete;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
 * compete, has 6 judges
 * range[1-100]
 * the final score is remove the highest and lowest
 * the average score of the rest of the four numbers
 *
 * */
public class SingCompete {
    public static void main(String[] args) {
        int[] arr;
        Score score = new Score();
        arr = score.getArr();

        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        int sum = 0;
        int len = arr.length - 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(max + " " + min);
        for (
                int i = 0;
                i < arr.length; i++) {
            if (i == maxIndex || i == minIndex) {
                continue;
            }
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(len);
        System.out.println("average " + sum / len);
    }
}

class Score {

    public int[] getArr() {
        int[] arr = new int[6];
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("please enter the number:");
            temp = sc.nextInt();
            if (temp <= 100 && temp >= 1) {
                arr[i] = temp;
                i++;
            } else {
                System.out.println("please enter a right number:");
            }

        }
        return arr;
    }

}