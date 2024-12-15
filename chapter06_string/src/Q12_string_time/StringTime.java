package Q12_string_time;
/*
* num1 num2 are string, get the time result of them,
* then the result should also as a string
*
* */
public class StringTime {
    public static void main(String[] args) {
        String num1 = "1234";
        int temp1 = 0;
        int temp2 = 0;
        String num2 = "5678";
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        for (int i = len1, j = 0; i >= 0; i--, j++) {
            int digit1 = num1.charAt(i) - '0';
            temp1 = (int)Math.pow(10, j) * digit1 + temp1;
            System.out.println(temp1);
        }
        for (int i = len2, j = 0; i >= 0; i--, j++) {
            int digit2 = num2.charAt(i) - '0';
            temp2 = (int)Math.pow(10, j) * digit2 + temp2;
            System.out.println(temp2);
        }
        int res = temp1 * temp2;
        System.out.println(res);
        String num3 = res + "";
        System.out.println(num3);
    }
}
