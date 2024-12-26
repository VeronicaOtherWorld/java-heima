package Q2_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorExe {
	public static void main(String[] args) {
	/**
	 * 迭代器遍历 需要删除元素时
	 * 列表迭代器 需要添加元素
	 * 增强for
	 * lambda
	 *        仅仅遍历
	 * 普通for 想操作索引
	 * */

	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");

	// iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next.equals("c")) {
				iterator.remove();
			}
		}
		System.out.println(list);

	// list iterator
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String str = (String) listIterator.next();
			System.out.println(str);
		// 	extra method: add
			if("a".equals(str)) {
				listIterator.add("r");
			}
		}
		System.out.println(list);

	}
}
