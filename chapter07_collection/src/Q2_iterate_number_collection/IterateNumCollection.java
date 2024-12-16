package Q2_iterate_number_collection;

import java.util.ArrayList;

public class IterateNumCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("[");
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (i != list.size() - 1) {
                sb.append(list.get(i)).append(",");
            } else {
                sb.append(list.get(i));
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
