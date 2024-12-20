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

/**
 * pro:
 * 右边对象可以实现解耦合,便于扩展和维护
 *
 * 定义方法时候,可以使用parent作为参数,接收所有子类对象,体现多态的拓展与便利性
 *
 *
 * con:
 * 不能调用子类的特有功能
 * 向下转型?
 * Parent p1 = new Child();
 * Child c1 = (Child) p1;
 *
 * 团队合作的时候,先进行类型判断
 * object name instanceof class name
 * 减少出现问题的情况
 *
 * 新特性:
 * 强转 与 判断写在一起
 * 是强转
 * 否false
 * if (a instanceof Dog d)
 * else if(a instance of Cat c)
 * else {
 *     false
 * }
 * */