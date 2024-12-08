package Q3_identity_card;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
* requirement
* enter an identity number
* get information
*
* info:
* BOD:7-14
* gender 17
*
* 622421196903065015
* 41292319660923451X
* 412928196509120330
* 412928196106260021
*
* 7-14 bod
*
* */
public class IdentityCardApp {
    public static void main(String[] args) {
        String BOD = "";
        String gender = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your card number: ");
        String cardNumber = sc.nextLine();
        IdentityCard identityCard  = new IdentityCard();
        identityCard.validateCardNumber(cardNumber);
        BOD = identityCard.getBOD();
        gender = identityCard.getGender();
        System.out.println(BOD);
        System.out.println(gender);

    }
}
