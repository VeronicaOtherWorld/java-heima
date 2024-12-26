package Q7_execise_1;

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
    //     不断处以2,得到余数,一直到商为0位置
    //     再把余数倒着拼接起来
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        while (true) {
            if(num == 0) {
                break;
            }
            // get remainder
            int remainder = num % 2;
            // 倒着拼接
            sb.insert(0, remainder);
            // 除以2
            num = num / 2;
            System.out.println(remainder);
        }
        System.out.println(sb.toString());
    }
}
