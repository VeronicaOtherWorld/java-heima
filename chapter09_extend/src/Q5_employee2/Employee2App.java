package Q5_employee2;

public class Employee2App {
    public static void main(String[] args) {

        Buyer buyer = new Buyer(" buy assistant", "1", "bibi");
        Maintainer maintainer = new Maintainer(" manager", "2", "mimi");
        Turor turor = new Turor("sub tutor", "3", "titi");
        Lecturer lecturer = new Lecturer(" lecturer", "4", "lili");
        System.out.println(buyer.toString());
        System.out.println(maintainer.toString());
        System.out.println(turor.toString());
        System.out.println(lecturer.toString());

    }
}
