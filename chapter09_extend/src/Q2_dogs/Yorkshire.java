package Q2_dogs;


public class Yorkshire extends Dogs {
    public Yorkshire() {
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("eat dog food and rice");
    }
}

