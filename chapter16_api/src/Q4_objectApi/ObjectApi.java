package Q4_objectApi;

/**
 * toString
 * equals
 * clone
 * */

/*
* clone
* 深克隆:基本数据类型拷贝,字符串在串池复用,引用数据类型会重新创建
* */

import com.google.gson.Gson;

import java.util.Objects;

/**
 * 第三方工具
 * third party
 * */
public class ObjectApi {
    public static void main(String[] args) {
        User user = new User(1,"sisi",20);
        User user3 = new User(1,"sisi",20);
        Gson gson = new Gson();
        // 把对象变成字符串
        String strUser = gson.toJson(user);
        //   把字符串变回对象
        User user2 = gson.fromJson(strUser, User.class);
        System.out.println(user2.toString());


        /**
         * Objects
         * isNull
         * equals
         * nonNull
         * */
        boolean res = Objects.equals(user, user3);
        System.out.println(res);
    }
}
