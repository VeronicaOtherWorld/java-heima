package Q4_employee;

public class Manager extends Employee {
    private int bonus;
    public Manager() {
    }
    public Manager(String id, String name, double salary, int bonus) {
        super(id, name, salary);
    }
    @Override
    public void work(){
        System.out.println("Employee manage");
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "bonus=" + bonus +
                '}';
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
