package Q1_stuMtg;

public class PersonApp {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("tt",28);
        Student student = new Student("ss",12);
        Admin ad = new Admin("aa", 33);
        register(teacher);
        register(student);
        register(ad);

    }
    public static void register (Person p){
        System.out.println(p.toString());
    }
}
