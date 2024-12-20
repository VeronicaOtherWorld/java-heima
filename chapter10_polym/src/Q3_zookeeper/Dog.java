package Q3_zookeeper;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.println("the dog" + getName() + " which is " +
                getAge() + " eat " + food);
    }
    public void keepHouse(){
        System.out.println("dog keep house");
    }
}
