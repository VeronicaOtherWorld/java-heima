package Q3_constructor;

/**
 *子类初始化之前, 默认先访问parent中的无参构造
 * 因为要先完成parent 数据空间的初始化
 * 否则无法使用parent中的数据
 *
 * 如何调用?
 * 子类构造方法的第一行语句默认是 super()
 * 不写也默认存在
 * 还必须在第一行
 *
 * 所有,如果没有无参构造,只有有参构造,必须手动写super调用,
 * 并把parent 的参数传递过去
 * */
public class KnowAboutConstructor {
}
