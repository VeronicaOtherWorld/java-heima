package Q3_zookeeper;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("the cat " + getName() + " which is " +
                getAge() + " eat " + food);
    }
    public void catchMice(){
        System.out.println("cat catch mice");
    }
}
