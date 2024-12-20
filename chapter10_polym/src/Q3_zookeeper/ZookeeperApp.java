package Q3_zookeeper;

public class ZookeeperApp {
    public static void main(String[] args) {
        Animal dog = new Dog("didi", 2);
        Dog dog2 = (Dog) dog;
        Animal cat = new Cat("cici", 1);
        Cat cat2 = (Cat) cat;
        dog2.eat("bone");
        cat2.eat("fish");
        Zookeeper zookeeper = new Zookeeper("zizi", 20);
        dog.getName();
        zookeeper.keepPet(dog, "candy");
        zookeeper.keepPet(cat, "butter");

    }
}
