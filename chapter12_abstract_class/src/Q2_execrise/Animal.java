package Q2_execrise;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void drink(){
        System.out.println(name + "drink");
    }
}
