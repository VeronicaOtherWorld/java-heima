package Q1_Utils;

import java.util.ArrayList;


/**
 * static
 * 静态方法只能访问静态 attribute和 method
 * 非静态方法可以访问 静态和非静态的 attribute和method
 * 静态方法中没有this关键字
 *
 *
 * this 表示当前类调用者的地址值
 * (student this)
 * this -> student address
 * s1.print(Student this) this -> s1
 * s2.print(Student this) this -> s2
 * */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double[] arr2 = {1,1,2,3.4, 4.8};
        String res = Utils.printArr(arr);
        System.out.println(res);
        Utils.getAverage(arr2);
        System.out.println(Utils.getAverage(arr2));

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("lili", 2, 'f'));
        stuList.add(new Student("qiqi", 14, 'm'));
        stuList.add(new Student("sisi", 24, 'f'));
        int max = Utils.getMax(stuList);
        System.out.println(max);
    }
}
