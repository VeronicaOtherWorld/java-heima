package Q6_stu_mgt;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgt {
    private int id;
    private String name;
    private int age;
    private String address;
    // private ArrayList<StudentMgt> stuList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public StudentMgt() {
    }

    public StudentMgt(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    // add
    public void addStudent(ArrayList<StudentMgt> stuList) {
        System.out.println("add student");
        int id = stuList.size() + 1;
        System.out.println("enter student name");
        String name = sc.next();
        System.out.println("enter student age");
        int age = sc.nextInt();
        System.out.println("enter student address");
        String address = sc.next();
        StudentMgt sm = new StudentMgt(id, name, age, address);
        stuList.add(sm);
        System.out.println("add student success");
    }

    // delete
    public boolean deleteStudent(ArrayList<StudentMgt> stuList, int id) {
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId() == id) {
                stuList.remove(i);
                return true;
            }
        }
        return false;
    }

    // modify set 1 find index
    public int getStudentIndex(ArrayList<StudentMgt> stuList, int id){
        int index = -1;
        for (int i = 0; i < stuList.size(); i++) {
            if (stuList.get(i).getId() == id) {
                index = i;
                return index;
            }
        }
        return index;
    }

    // modify set
    public void modifyStudent(ArrayList<StudentMgt> stuList, int index) {
        System.out.println("modify student name");
        String newName = sc.next();
        System.out.println("modify student age");
        int newAge = sc.nextInt();
        System.out.println("modify student address");
        String newAddress = sc.next();
        StudentMgt sm = new StudentMgt(index + 1, newName, newAge, newAddress);
        stuList.set(index, sm);
        System.out.println(stuList);
    }

    // query student
    public void queryStuList(ArrayList<StudentMgt> stuList) {
        if (stuList.size() == 0) {
            System.out.println("no items found, please try again");
            return;
        }
        System.out.println("id\tname\tage\taddress");
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i).toString());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age + "\t" + address;
    }
}
