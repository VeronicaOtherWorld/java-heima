package q7_two_dimensional;

public class TwoDimensional {
    public static void main(String[] args) {
        int [][] twoDimensional = {
                {1,2,3},
                {4,5,6}
        };

        for(int i = 0; i < twoDimensional.length; i++) {
            for(int j = 0; j < twoDimensional[i].length;j++) {
                System.out.print(twoDimensional[i][j] + " ");
            }
            System.out.println();
        }

        int[][] sales = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int sum = 0;
        int total = 0;
        for(int i = 0;i < sales.length;i++) {
            for(int j = 0; j<sales[i].length;j++) {
                sum += sales[i][j];
            }
            System.out.println(sum);
            total += sum;
            System.out.println("total " + total);
        }
    }
}
