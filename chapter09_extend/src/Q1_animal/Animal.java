package Q1_animal;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println( name + " animal eat");
    }
    public void drink(){
        System.out.println( name + "animal drink");
    }
}

class Cat extends Animal{
    private String name;
    public Cat() {

    }

    public Cat(String name) {
        super(name);
        this.name = name;
    }

    public void catchMice(){
        System.out.println(name + "cat catch mice");
    }
}

class Dog extends Animal{
    public Dog() {

    }

    public Dog(String name) {
        super(name);
    }

    public void keepHouse(){
        System.out.println("dog keep house");
    }
}
class Husky extends Dog{
    public Husky(){

    }
    public void ruin(){
        System.out.println("Husky ruin");
    }
}

class Teddy extends Dog{
    public Teddy(){}
    public void sniff(){
        System.out.println("Teddy sniff");
    }

}