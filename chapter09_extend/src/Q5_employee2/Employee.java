package Q5_employee2;

public class Employee {
    private String position;
    private String id;
    private String name;

    public Employee() {
    }

    public Employee(String position, String id, String name) {
        this.position = position;
        this.id = id;
        this.name = name;
    }

    public void work(){
        System.out.println("employee work");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
