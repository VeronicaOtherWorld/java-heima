package Q2_execrise;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Sheep is eating grass");

    }
}
