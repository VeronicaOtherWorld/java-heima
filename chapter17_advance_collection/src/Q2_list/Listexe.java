package Q2_list;

import java.util.ArrayList;
import java.util.List;

public class Listexe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");

		// add 原来索引删的元素会依次往后移动
		list.add(1, "qqq");
		System.out.println(list);

		String str = list.remove(0);
		System.out.println(str);
		System.out.println(list);
		// remove
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		// 此时删除的是索引值
		intList.remove(1);
		System.out.println(intList);
		// 此时删除的是对象
		Integer i = Integer.valueOf(1);
		intList.remove(i);
		System.out.println(intList);


	// 	set
		list.set(3, "three");
		System.out.println(list);


	// 	get
		String str1 = list.get(0);
		System.out.println(str1);
	}
}
