package Q2_mask_phone_number;

import java.util.Scanner;

public class MaskPhoneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = sc.nextLine();
        MaskPhone mp = new MaskPhone();
        number = mp.maskPhone(number);
        System.out.println(number);
    }
}
