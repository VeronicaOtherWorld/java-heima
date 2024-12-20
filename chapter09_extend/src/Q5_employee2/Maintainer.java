package Q5_employee2;

public class Maintainer extends Admin {
    public Maintainer() {
    }

    public Maintainer(String position, String id, String name) {
        super(position, id, name);
    }
    @Override
    public void work(){
        System.out.println("maintainer work");
    }
}
