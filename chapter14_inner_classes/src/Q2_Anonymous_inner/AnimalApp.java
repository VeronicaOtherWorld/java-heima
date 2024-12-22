package Q2_Anonymous_inner;

import java.sql.SQLOutput;

public class AnimalApp {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.print(a);
        a.print(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("cat eating");
                    }
                }
        );
    }
}
