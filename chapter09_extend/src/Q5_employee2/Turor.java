package Q5_employee2;

public class Turor extends Teacher {
    public Turor() {
    }

    public Turor(String position, String id, String name) {
        super(position, id, name);
    }
    @Override
    public void work(){
        System.out.println("turor work");
    }
}
