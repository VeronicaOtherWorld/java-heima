package Q3_car;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("enter car name" + (i + 1) + ":" );
            cars[i].setBrand(sc.next());
            System.out.println("enter car colour" + (i + 1) + ":" );
            cars[i].setColor(sc.next());
            System.out.println("enter car price" + (i + 1) + ":" );
            cars[i].setPrice(sc.nextInt());
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
