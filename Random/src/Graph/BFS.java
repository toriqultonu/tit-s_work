package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

    static Queue queue = new LinkedList();

    public static void BFS(int arr[][], int start, int n){

        int i = start, j;
        int[] visited = new int[n];
        System.out.print(i+" ");
        visited[i] = 1;
        queue.add(i);

        while (!queue.isEmpty()){

            i = (int) queue.poll();

            for(j = 0;j<n-1;j++){

                if(arr[i][j] == 1 && visited[j] == 0){

                    System.out.print(j+" ");
                    visited[j] = 1;
                    queue.add(j);
                }
            }

        }
    }

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter number of vertices: ");
        n = scanner.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter graph data in matrix: ");
        for(int i=0;i<n; i++){

            for(int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
            }

        }

        System.out.print("Enter starting index: ");

        int start = scanner.nextInt();

        BFS(arr, start, n);

    }
}
