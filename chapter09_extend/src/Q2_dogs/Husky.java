package Q2_dogs;

public class Husky extends Dogs{
    public Husky() {
    }

    public void ruin(){
        System.out.println("ruin home");
    }

    @Override
    public void eat() {
        System.out.println("eat dog food");
    }
}
