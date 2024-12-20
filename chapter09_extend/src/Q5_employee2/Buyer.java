package Q5_employee2;

public class Buyer extends Admin {
    public Buyer() {
    }

    public Buyer(String position, String id, String name) {
        super(position, id, name);
    }
    @Override
    public void work(){
        System.out.println("Buyer works");
    }
}
