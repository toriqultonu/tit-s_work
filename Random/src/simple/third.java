package simple;


import java.util.Scanner;

public class third {

        public static void main(String[] args) {
            int[][] arr = {{9, 4, 5}, {4, 3, 8}};
            for (int row = 1; row < arr.length; row++) {
                for (int col = 1; col < arr[0].length; col++) {
                    if (arr[row][col] % 2 == 1)
                        arr[row][col] = arr[row][col] + 1;
                    else
                        arr[row][col] = arr[row][col] + 2;
                }
            }


            System.out.println( arr[0][0]);
            System.out.println( arr[0][1]);
            System.out.println( arr[0][2]);
            System.out.println( arr[1][0]);
            System.out.println( arr[1][1]);
            System.out.println( arr[1][2]);
        }

}
