package Q6_stu_mgt;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgtApp {
    public static void main(String[] args) {
        StudentMgt sm = new StudentMgt();
        ArrayList<StudentMgt> stuList = new ArrayList<>();
        ArrayList<User> userList = new ArrayList<>();
        boolean flag = true;
        boolean loginFlag = true;
        User user = new User();
        Scanner sc = new Scanner(System.in);
        while (loginFlag) {
            System.out.println("welcome to the student mgt system");
            System.out.println("1. login \t2.register \t3. forget password");
            System.out.println("choose a number to manage you account:  ");
            String choice = sc.next();
            System.out.println(choice);
            switch (choice) {
                case "1":
                    System.out.println("login");
                    user.Login(userList);
                    break;
                case "2":
                    System.out.println("register");
                    user.register(userList);
                    break;
                case "3":
                    System.out.println("forget password");
                    user.retPassword(userList);
                    break;
                default:
                    break;
            }
        }
        // while (flag) {
        //     System.out.println("\"-------------welcome to student mgt system----------------\"\n" +
        //             "\"1：add student\"\n" +
        //             "\"2：delete student\"\n" +
        //             "\"3：modify student\"\n" +
        //             "\"4：query student\"\n" +
        //             "\"5：exit\"\n" +
        //             "enter your choice(number): ");
        //     int menuNum = sc.nextInt();
        //     switch (menuNum) {
        //         case 1:
        //             sm.addStudent(stuList);
        //             System.out.println(stuList);
        //             break;
        //         case 2:
        //             System.out.println("delete student");
        //             System.out.println("eneter the id of student that you want to delete");
        //             int id = sc.nextInt();
        //             boolean res = sm.deleteStudent(stuList, id);
        //             System.out.println(res);
        //             if (res) {
        //                 System.out.println("student deleted");
        //                 break;
        //             } else {
        //                 System.out.println("student not deleted");
        //                 break;
        //             }
        //         case 3:
        //             System.out.println("modify student");
        //             System.out.println("eneter the id of student that you want to update");
        //             int updateId = sc.nextInt();
        //             int resIndex = sm.getStudentIndex(stuList, updateId);
        //             if (resIndex == -1) {
        //                 System.out.println("student not found");
        //                 break;
        //             }
        //             sm.modifyStudent(stuList,resIndex);
        //             break;
        //         case 4:
        //             System.out.println("query student");
        //             sm.queryStuList(stuList);
        //             break;
        //         case 5:
        //             System.out.println("exit");
        //             flag = false;
        //             break;
        //         default:
        //             System.out.println("enter a number");
        //             break;
        //     }
        // }
    }
}
