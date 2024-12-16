package Q4_iterate_object_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectCollectionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ObjectCollection> list = new ArrayList<ObjectCollection>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter student age: ");
            int age = sc.nextInt();
            list.add(new ObjectCollection(name, age));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}
