package Q4_employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Manager manager = new Manager("1", "join",2000,100);
        Chief chief = new Chief("3","sosi",1000);
        System.out.println(manager.toString());
        System.out.println(chief.toString());
        chief.eat();
        chief.work();
        manager.eat();
        manager.work();
    }
}
