package AlgoProbs;

import java.util.Arrays;

public class SearchInSortedMatrix {

    static int[] searchInSortedMatrix(int[][] matrix, int target){

        int i =0;
        int j = matrix[0].length-1;

        while(i<matrix.length && j>=0){

           if(target< matrix[i][j]){
               j--;
           }
           else if (target> matrix[i][j]) {
               i++;
           }
           else{
               return new int[] {i, j};
           }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args){

        int[][] matrix = {{1, 4, 7, 12, 15, 1000}, {2, 5, 19, 31, 32, 1001}, {3, 8, 24, 33, 35, 1002}, {40, 41, 42, 44, 45, 1003}, {99, 100, 103, 106, 128, 1004}};

        int[] result = searchInSortedMatrix(matrix, 44);
        System.out.println(result[0] +" "+result[1]);
    }
}
