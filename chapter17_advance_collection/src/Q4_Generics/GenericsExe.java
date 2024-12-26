package Q4_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsExe {
	public static void main(String[] args) {
	/**
	 * 泛型类: 当一个类中,某个变量的数据类型不确定时,可以定义带有泛型的类
	 * 泛型方法
	 * */
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
	}
}
// t can be any letter t e k v
/*
* 此时不确定
*
* 编写类的时候,不确定类型,可以定义为泛型类
* */
class MyArrayList<E> {
	Object[] obj = new Object[10];
	int size;

	/*
	* T 不确定的类型,在类名后面已经定义过了
	* t 形参名字
	* */
	public boolean add(E e) {
		obj[size] = e;
		size++;
		return true;
	}
	public E get(int index) {
		return (E) obj[index];
	}

	@Override
	public String toString() {
		return "ArrayList{" +
						"obj=" + Arrays.toString(obj) +
						", size=" + size +
						'}';
	}
}
