package Q2_knowledge;

/***
 * attribute: 编译看左边,运行看左边(parent)
 * 存在,编译成功,不存在,编译失败
 * 运行时候,获取左边parent中成员attribute
 *
 *
 * method: 编译看左边,运行看右边
 * 编译,先看左边,看parent中是否有这个方法,如有,编译成功,否则失败
 * 运行时候,看右边,运行右边的方法
 * */

/**
 * Animal a = new Dog();
 * 用a调用变量和方法, 是animal 类型,默认从中去找
 *
 * 成员attribute:
 * 在子类中,会把parent 的attribute继承下来
 * 用parent调用,获取parent attribute
 *
 *
 * 成员method:
 * 如果子类对方法进行重写了,会覆盖 override,所以调用的是子类的方法
 *
 *
 * 成员attribute 就近
 * 成员method 覆盖 override
 * * * * */
public class Knowledge {
}
