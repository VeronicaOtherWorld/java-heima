package Q3_iterate_char_collection;

import java.util.ArrayList;

public class CharCollection {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
