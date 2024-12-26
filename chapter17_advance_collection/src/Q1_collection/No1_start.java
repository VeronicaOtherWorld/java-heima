package Q1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class No1_start {
    public static void main(String[] args) {
     Collection<String> collection = new ArrayList<>();
     collection.add("a");
     collection.add("b");
     collection.add("c");
     collection.add("d");

      // clear
      //    clear()
      // remove
      //    if the element is not exist
      //    return false, delete failed
      collection.remove("a");

      // contains
      boolean b = collection.contains("c");
      System.out.println(b);


      // iterator

      /**
       * notes:
       * 1.报错 是nosuchelement exception
       * 2.迭代器遍历完毕之后,指针不会复位
       * 3.循环中只能用一次next方法,不能打印
       * 4.迭代器遍历时,不能用集合的方法今夕增改删
       * */
      Iterator<String> iterator = collection.iterator();
      while (iterator.hasNext()) {
        // 只能调用一次next方法,就算是打印也不行,会报错
        String str = iterator.next();
        System.out.println(str);
      //   结束之后,迭代器已经指向了最后没有元素的位置
      //   指针不会复位
      }
    //   如果想要二次遍历,需要创建新的迭代器对象


    //   for
      for (String s : collection) {
        System.out.println(s);
        // 循环中修改第三方变量,不会改变集合中原有的数据
        s = "qq";
        System.out.println(s);
      }
    }
}
