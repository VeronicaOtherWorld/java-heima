package Q2_execrise;

public class AinamlApp {
    public static void main(String[] args) {
        Dog dog = new Dog("dd",1);
        Frog frog = new Frog("ff",3);
        Sheep sheep = new Sheep("ss",4);
        dog.eat();
        frog.eat();
        sheep.eat();
        dog.drink();
        frog.drink();
        sheep.drink();
    }
}
