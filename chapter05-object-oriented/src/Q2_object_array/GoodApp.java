package Q2_object_array;

public class GoodApp {
    public static void main(String[] args) {
        Good[] goods = new Good[3];
        goods[0] = new Good("candy", 1,33.4);
        goods[1] = new Good("juice", 2,44.4);
        goods[2] = new Good("cookies", 4,55.4);
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].toString());
        }
    }
}
