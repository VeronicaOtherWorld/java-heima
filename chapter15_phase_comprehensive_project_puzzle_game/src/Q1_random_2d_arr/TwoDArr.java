package Q1_random_2d_arr;

import java.util.Random;

public class TwoDArr {
    public static void main(String[] args) {
    /*
    * create a random 2d array
    * */
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[][] newArr = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randNum = rand.nextInt(0, 16);
            int temp = arr[i];
            arr[i] = arr[randNum];
            arr[randNum] = temp;
        }
        // method 1
        // for (int i = 0, k = 0; i < newArr.length; i++) {
        //     for (int j = 0; j < newArr[i].length; j++) {
        //         newArr[i][j] = arr[k++];
        //     }
        // }
        // method 2
        for (int i = 0; i < arr.length; i++) {
            newArr[i / 4][i % 4] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
