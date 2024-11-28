package q2_security_code;

import java.util.Random;

/*
* create a security code randomly
* length: 5
* 1-4 are uppercase or lowercase letters
* the last one is a number
*
* 65-90：大写英文字母
* 91-96 标点
* 97-122 小写
*
* */
public class Security {
    public static void main(String[] args) {

        String code = "";
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            // if the number is equal or less than 4
            // random create a letter
            if(i < 4) {
                int temp = random.nextInt(65, 123);
                if(temp >= 91 && temp <= 96) {
                    continue;
                }
                code += (char)temp;
            //     add the last number in the fifth place
            } else {
                int temp = random.nextInt(0, 10);
                code += temp;
            }
        }
        System.out.println(code);
    }
}
