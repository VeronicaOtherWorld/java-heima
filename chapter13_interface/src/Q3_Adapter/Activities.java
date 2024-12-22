package Q3_Adapter;

/**
 * 适配器方法
 *
 * 当一个接口中抽象方法过多时,但只需要使用部分,
 * 可以使用适配器设计模式
 *
 * 步骤:
 * 1.编写中间类 adapter,实现对应的接口中,并对方法实现空实现
 * 2.让真正的实现类继承中间类,并重写需要使用的方法
 * 3.为避免其他类创建适配器类对象,用abstract修饰类
 *
 * */

public interface Activities {
    public abstract void sayHello();
    public abstract void dance();
    public abstract void hiking();
}
