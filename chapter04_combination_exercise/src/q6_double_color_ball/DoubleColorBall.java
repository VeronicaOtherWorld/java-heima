package q6_double_color_ball;

import java.util.Random;
import java.util.Scanner;

/*
 * 投注的号码由 6个 红球, 1个蓝球组成
 * 红球 1-33 每个球都不能重复
 * 蓝球 1-10 可以与红球重复
 *
 * 1等奖: 6红1蓝 1000万
 * 2等奖: 6红0蓝 500万
 * 3等奖: 5红1蓝 3000
 * 4等奖: 5红0蓝
 *       4红1蓝
 * 5等奖:4红0蓝
 *       3红1蓝
 * 六等奖:2红1蓝
 *       1红1蓝
 *       0红1蓝
 *
 * */
public class DoubleColorBall {
    public static void main(String[] args) {
        // 创建红球随机数组
        // 创建随机蓝球 int
        // compare
        int[] redBalls = new int[33];
        int[] newRed = new int[6];
        int[] userRedBalls = new int[6];
        int blueBall = 0;
        int temp = 0;
        int redCount = 0, blueCount = 0;
        Random random = new Random();
        Balls balls = new Balls();
        for (int i = 0; i < redBalls.length; i++) {
            redBalls[i] = i + 1;
        }
        for (int i = 0; i < redBalls.length; i++) {
            int randomIndex = random.nextInt(33);
            temp = redBalls[i];
            redBalls[i] = redBalls[randomIndex];
            redBalls[randomIndex] = temp;
            // System.out.println(redBalls[i]);
        }
        newRed = balls.getRedArr(redBalls);
        for (int i = 0; i < newRed.length; i++) {
            System.out.print(newRed[i] + " ");
        }
        blueBall = balls.getBlueBall();
        System.out.println(blueBall);
        userRedBalls = balls.getUserRedBall();
        int userBlueBall = balls.getUserBlueBall();

        // determine every number in the user array is in the original array or not
        for (int i = 0; i < userRedBalls.length; i++) {
            for (int j = 0; j < newRed.length; j++) {
                if (newRed[j] == userRedBalls[i]) {
                    redCount++;
                    System.out.println("redCount: " + redCount);
                    break;
                }
            }
        }

        if (userBlueBall == blueBall) {
            blueCount++;
        }
        if (redCount == 6 && blueCount == 1) {
            System.out.println("10 million");
        } else if ((redCount == 6 && blueCount == 0)) {
            System.out.println("5 million");
        } else if ((redCount == 5 && blueCount == 1)) {
            System.out.println("3000");
        } else if ((redCount == 5 && blueCount == 0) ||
                (redCount == 4 && blueCount == 1))
        {
            System.out.println("200");
        } else if ((redCount == 4 && blueCount == 0) ||
                (redCount == 3 && blueCount == 1))
        {
            System.out.println("10");
        } else if((redCount == 2 && blueCount == 1) ||
                (redCount == 1 && blueCount == 1) ||
                (redCount == 0 && blueCount == 1))
        {
            System.out.println("5");
        } else {
            System.out.println("0");
        }
    }
}

class Balls {
    // create 6 red ball numbers
    public int[] getRedArr(int[] arr) {
        int[] balls = new int[6];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = arr[i];
        }
        return balls;
    }

    public int getBlueBall() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public int[] getUserRedBall() {
        int[] userRedBalls = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < userRedBalls.length;) {
            System.out.println("Enter " + (1 + i) + " red ball: ");
            int temp = in.nextInt();
            if(temp >=1 && temp <= 33) {
                boolean flag = getFlag(temp, userRedBalls);
                if(!flag) {
                    userRedBalls[i] = temp;
                    i++;
                } else {
                    System.out.println("the number is repeated");
                }
            } else {
                System.out.println("the number is out of range");
            }
        }
        return userRedBalls;
    }

    public int getUserBlueBall() {
        System.out.println("Enter blue ball: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    // Determine whether the numbers are duplicated
    public boolean getFlag(int ball, int[] redBalls) {
        for (int i = 0; i < redBalls.length; i++) {
            if (ball == redBalls[i]) {
                System.out.println("");
                return true;
            }
        }
        return false;
    }
}