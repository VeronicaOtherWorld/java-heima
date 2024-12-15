package Q6_join_int;

public class JoinInt {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("[");
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        System.out.println(sb.toString());
    }
}
