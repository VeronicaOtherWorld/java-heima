package Q1_inner_class;

public class Car { // out class
    private String color;
    private int age;
    private String brand;
     class Engine{ // inner class
         private String engineName;
         private int engineAge;
     }
}

/**
 * 内部类表示的是外部类的一部分
 * 内部类单出出现没有任何意义
 *
 *
 * 访问特点“
 * 1.内部类可以直接访问外部类的成员,包括私有方法
 * 2.外部类要访问内部类成员,必须创建对象
 * */
