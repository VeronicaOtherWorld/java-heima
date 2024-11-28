package q5_raffle;

import java.util.Random;

/*
* in an event
* has some red envelope
* {2, 588, 888, 1000, 9999}
* raffle, the gifts randomly and unrepeated
* only show 5 times
* */
public class Raffle {
    public static void main(String[] args) {
        int [] gifts = {5, 588, 888,1000, 9999};
        int[] newArr = new int[gifts.length];
        boolean flag = true;
        Gift g = new Gift();
        Random rand = new Random();
        for (int i = 0; i < gifts.length;) {
            int giftIndex = rand.nextInt(gifts.length);
            // compare the new prize exists in the new arr or not
            // if not, assign
            // if exists, try again
            flag = g.compare(gifts[giftIndex], newArr);
            if (!flag) {
                System.out.println(gifts[giftIndex]);
                newArr[i] = gifts[giftIndex];
                // the index only increase when
                // get the prize randomly at first time
                i++;
            }
        }
    }
}
class Gift{
    public boolean compare(int gift, int []arr){
        for (int i = 0; i < arr.length; i++) {
            if (gift == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
