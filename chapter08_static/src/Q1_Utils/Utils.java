package Q1_Utils;

import java.util.ArrayList;

public class Utils {
    private Utils() {
        throw new UnsupportedOperationException("Utils class cannot be instantiated");
    }
    // turn arr to String
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(",");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
    // average
    public static double getAverage(double[] arr){
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;

    }
    // get the largest student age
    public static int getMax(ArrayList<Student> stuList){
        if(stuList.size() == 0){
            return -1;
        }
        int max = stuList.get(0).getAge();
        for (int i = 1; i < stuList.size(); i++) {
            if (stuList.get(i).getAge() > max) {
                max = stuList.get(i).getAge();
            }
        }
        return max;
    }
}
