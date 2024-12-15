package Q9_twoString;

/*
* 15/12/2024
* */
/**
 * A B
 * move the leftest letter to rightest in A
 * keep trying
 * before the loop ends, if A == B
 * return true
 * */
public class TwoString {
    public String twoString(String A) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < A.length(); i++) {
            // we also can use substring
            sb.append(A.charAt(i));
        }
        A = sb.append(A.charAt(0)).toString();
        System.out.println(A);
        return A;
    }
}
