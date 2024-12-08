package Q5_stringBulider;

import java.lang.invoke.StringConcatFactory;

public class joinString {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String[] arr = {"a", "b", "c"};
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]);
        }
        builder.reverse();
        word = builder.toString();

        System.out.println(word);
    }
}
