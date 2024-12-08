package Q1_amount_conversion;

import java.util.Scanner;

public class AmountConversionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountConversion ac = new AmountConversion();
        // 1 get the amount that user entered
        System.out.println("enter  the amount you want to convert");
        int amount = sc.nextInt();
        if (amount <= 0 || amount >= 1000000) {
            System.out.println("invalid amount");
            return;
        }

        // 2. convert number to the Chinese capital numbers
        int digit = 0;
        String captionNum = "";
        while (true) {
            if (amount == 0) break;
            digit = amount % 10;
            amount = amount / 10;
            System.out.println(digit);
            ac.convertCaptionNum(digit);
            captionNum = ac.getCaptionNum() + captionNum;
        }

        // 3. fill the number, must be a 7-digit figure
        int count = captionNum.length();
        System.out.println(count);
        for (int i = 0; i < (7 - count); i++) {
            captionNum = "零" + captionNum;
        }
        System.out.println(captionNum);

        // 4. completion the units
        ac.computeCaptionNum(captionNum);
        System.out.println(ac.computeCaptionNum(captionNum));

    }
}
