package Q9_twoString;

public class TwoStringApp {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "dea";
        boolean flag = false;
        TwoString ts = new TwoString();
        for (int i = 0; i < A.length(); i++) {
            A = ts.twoString(A);
            if (A.equals(B)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
