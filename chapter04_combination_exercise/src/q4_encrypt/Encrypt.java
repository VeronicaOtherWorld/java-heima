package q4_encrypt;

/*
* encrypt
* each position + 5
* % 10
* reverse whole number
* */
public class Encrypt {
    public static void main(String[] args) {
        // int num = 12345, digit = 0,temp = num;
        // int newNum = 0;
        // while (temp != 0) {
        //     digit = temp % 10;
        //     digit = (digit + 5) % 10 ;
        //     newNum = newNum * 10 + digit;
        //     temp /= 10;
        // }
        // System.out.println(newNum);

        int count = 0, digit = 0, index = 0;
        int num = 42345, newNum = 0;
        int temp = num, temp2 = num;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp2 % 10;
            temp2 = temp2 / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (arr[i] +5) % 10;
            System.out.println(arr[i]);
            newNum = newNum * 10 + arr[i];
        }
        System.out.println(newNum);
    }
}
