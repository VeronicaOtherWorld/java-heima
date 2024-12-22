package Q2_execrise;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
