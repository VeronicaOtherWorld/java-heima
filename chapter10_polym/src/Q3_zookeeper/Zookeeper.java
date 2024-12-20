package Q3_zookeeper;

public class Zookeeper {
    private String name;
    private int age;

    public Zookeeper() {
    }

    public Zookeeper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal animal, String food) {
        if (animal instanceof Cat) {
            System.out.println(this.name + "who is " + getAge() +
                    ", has a cat ");
            animal.eat(food);
        } else if (animal instanceof Dog) {
            System.out.println(this.name + "who is " + getAge() +
                    ", has a dog");
            animal.eat(food);
        } else {
            System.out.println("keeper does not support " + animal.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
