package Q11_validateCode;

// a security code ,len = 5, 4 letters(up low) ,1 number

import java.util.Random;

public class ValidateCode {
    public static void main(String[] args) {
        // letters
        char[] lettersArr = new char[52];
        Random random = new Random();
        char[] code = new char[5];
        for (int i = 65, j = 0; 65 <= i && i <= 90; i++, j++) {
            lettersArr[j] = (char) i;
        }
        for (int i = 97, j = 26; i <= 122 && i >= 97 ; i++, j++) {
            lettersArr[j] = (char) i;
        }
        for (int i = 0; i < code.length - 1; i++) {
            int letterIndex = random.nextInt(0, 52);
            code[i] = lettersArr[letterIndex];
            // System.out.print(code[i]);
        }
        int ranNum = random.nextInt(0, 10);
        // System.out.println(ranNum);
        code[4] = (char) (ranNum + '0');
        // System.out.println(code[4]);
        for (int i = 0; i < code.length; i++) {
            // Fisher-Yate
            int index = random.nextInt(i + 1);
            char temp = code[i];
            code[i] = code[index];
            code[index] = temp;
        }
        for (int i = 0; i < code.length; i++) {
            // System.out.print(code[i]);
        }
        String codes = new String(code);
        System.out.println(codes);
    }
}
