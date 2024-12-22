package Q2_Anonymous_inner;

public class Animal {
    private int age;
    private String name;

    public void print(Animal a){
        a.eat();
    }
    public void eat(){
        System.out.println("Animal eat");
    }
}
