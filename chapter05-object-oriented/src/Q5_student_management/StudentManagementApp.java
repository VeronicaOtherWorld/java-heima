package Q5_student_management;

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentManagement[] student = new StudentManagement[3];
        student[0] = new StudentManagement(1,"lisa",12);
        student[1] = new StudentManagement(2,"andy",18);
        student[2] = new StudentManagement(3,"phil",16);
        StudentManagement[] newStudent = new StudentManagement[4];
        for (int i = 0; i < student.length; i++) {
            newStudent[i] = student[i];
        }

        newStudent[3] = new StudentManagement(4,"oke",18);
        student = null;
        for (int i = 0; i < newStudent.length; i++) {
            System.out.println(newStudent[i].toString());
        }

        // delete student by id
        StudentManagement[] newStudent2 = new StudentManagement[newStudent.length - 1];
        boolean flag = false;
        for (int i = 0, j = 0; i < newStudent.length; i++) {
            if (newStudent[i].getId() == 4) {
                System.out.println("enter here");
                flag = true;
            } else {
                newStudent2[j] = newStudent[i];
                j++;
            }
        }

        if (!flag) {
            System.out.println("delete student failed");
        }
        newStudent = null;
        for (int i = 0; i < newStudent2.length; i++) {
            System.out.println(newStudent2[i].toString());
        }
        // find student by id
        boolean flag2 = false;
        for (int i = 0; i < newStudent2.length  ; i++) {
            if (newStudent2[i].getId() == 2) {
                newStudent2[i].setAge(newStudent2[i].getAge() + 1);
                flag2 = true;
            }
        }
        if (!flag2) {
            System.out.println("find student failed");
        }
        for (int i = 0; i < newStudent2.length; i++) {
            System.out.println(newStudent2[i].toString());
        }
    }
}
