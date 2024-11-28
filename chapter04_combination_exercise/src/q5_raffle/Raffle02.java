package q5_raffle;

/*
 * in an event
 * has some red envelope
 * {2, 588, 888, 1000, 9999}
 * raffle, the gifts randomly and unrepeated
 * only show 5 times
 * */

import java.util.Random;

/**
 * Scramble the index
 * */
public class Raffle02 {
    public static void main(String[] args) {
        int [] prize = {2, 588, 888, 1000, 9999};
        int temp = 0;
        int randomIndex = 0;
        Random rand = new Random();
        for (int i = 0; i < prize.length; i++) {
            temp = prize[i];
            randomIndex = rand.nextInt(prize.length);
            prize[i] = prize[randomIndex];
            prize[randomIndex] = temp;
        }
        for (int i = 0; i < prize.length; i++) {
            System.out.print(prize[i] + " ");
        }
    }
}
