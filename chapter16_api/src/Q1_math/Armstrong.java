package Q1_math;

import java.util.ArrayList;

// q1 统计有多少水仙花数 3位自幂数
// q2 是否存在2位数的自幂数
// q3 统计多少四叶玫瑰数, 五角星数
public class Armstrong {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> twoList = new ArrayList<>();
        ArrayList<Integer> fourList = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            int temp = i;
            int newNum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                newNum += (int) Math.pow(digit, 3);
                temp /= 10;
            }
            if (i == newNum) {
                list.add(i);
            }
        }
        System.out.println(list);

        for (int i = 10; i < 100; i++) {
            int temp = i;
            int newNum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                newNum += (int) Math.pow(digit, 2);
                temp /= 10;
            }
            if (i == newNum) {
                twoList.add(i);
            }
        }
        System.out.println(twoList);

        for (int i = 1000; i < 10000; i++) {
            int temp = i;
            int newNum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                newNum += (int)Math.pow(digit, 4);
                temp /= 10;
            }
            if (i == newNum) {
                fourList.add(i);
            }
        }
        System.out.println(fourList);
    }
}
