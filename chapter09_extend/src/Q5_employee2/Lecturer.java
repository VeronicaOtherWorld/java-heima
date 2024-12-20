package Q5_employee2;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String position, String id, String name) {
        super(position, id, name);
    }
    @Override
    public void work(){
        System.out.println("lecturer works");
    }
}
