package Q1_animal;


/*
*extend
*
* 1 构造器无法继承
* 2 成员变量都可以继承
* 3 成员方法 private, final, static 不能继承,
* 因为不能放入虚方法表.
* 这个表从 child向上传递直至object
* protect public 的都会放入
*
* 只有虚方法表中的方法才能被重写 override
*
* */
public class AnimalApp {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        an1.eat();

        // Upcasting
        Animal a1 = new Cat("muppet");
        a1.eat();
        a1.drink();
        Animal d1 = new Dog("hale");
        d1.eat();
        d1.drink();

        Dog d3 = new Husky();
        d3.drink();
        d3.keepHouse();
        // Downcasting
        Cat a2 = (Cat) a1;
        a2.catchMice();
        Dog d2 = (Dog) d1;
        d2.keepHouse();
        Husky d4 =  (Husky) d3;
        d4.drink();
        d4.ruin();
    }
}
