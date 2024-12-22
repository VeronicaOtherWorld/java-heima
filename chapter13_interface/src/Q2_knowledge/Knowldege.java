package Q2_knowledge;

public class Knowldege {

    private static void static1(){
        System.out.println("static1");
        static2();
    }
    private static void static2(){
        System.out.println("static2");
    }


    private void static3(){
        System.out.println("static3");
        static4();
    }

    private void static4(){
        System.out.println("static4");
    }
}

/*
jdk8之后,interface中可以定义有方法体的方法

默认
public default void methodname()
default不能去掉,否则认为是普通方法,会报错
重写此方法时,需要去掉default,否则也报错

静态
public static void methodname()



jdk9之后,interface中可以定义私有方法


* interface 中
* 普通的私有方法,给默认方法服务
*
* 静态私有方法,给静态方法服务
*
*
* */