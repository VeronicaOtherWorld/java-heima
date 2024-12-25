package Q2_system;

public class SystemApi {
    public static void main(String[] args) {
    /**
     * System.exit(0);
     * System.currentTimeMillis();
     * System.arraycopy
     * (original arr, 初始数组
     * start index, 从原数组中开始拷贝的index
     * copy to which arr, 新数组
     * the index in the new arr, 新数组中拷贝的index
     * number of item to copy 拷贝的个数)
     *
     * */
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int[] arr2 = new int[arr.length];
    int[] arr3 = new int[arr.length];
    int[] arr4 = new int[arr.length];
    System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    System.arraycopy(arr, 0, arr2, 0, arr.length);
    System.arraycopy(arr, 0, arr3, 4, 3);
    System.arraycopy(arr, 6, arr4, 2, 3);
    for (int i = 0; i < arr2.length; i++) {
        System.out.println(arr2[i]);
    }
    for (int i = 0; i < arr3.length; i++) {
        System.out.print(arr3[i]);
    }
        System.out.println();
    for (int i = 0; i < arr4.length; i++) {
        System.out.print(arr4[i]);
    }
    System.exit(0);
    }

}
