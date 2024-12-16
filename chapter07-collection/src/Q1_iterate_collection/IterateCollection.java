package Q1_iterate_collection;

import java.util.ArrayList;

public class IterateCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("[");
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            if(i != list.size() - 1) {
                sb.append(list.get(i)).append(",");
            } else {
                sb.append(list.get(i));
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
