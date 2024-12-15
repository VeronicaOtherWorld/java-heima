package Q7_string_joiner;

import java.util.StringJoiner;

public class JoinString {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[","]");
        String[] arr = {"1", "2", "3", "4", "5"};
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]);
        }
        int len = sj.length();
        System.out.println(len);
        System.out.println(sj.toString());
    }
}
