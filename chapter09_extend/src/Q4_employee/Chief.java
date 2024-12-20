package Q4_employee;

public class Chief extends Employee {
    public Chief() {

    }
    public Chief(String id,String name, int salary) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("Chief work str dish");
    }
}
