package Backtracking;


import java.util.Scanner;
import java.util.Stack;

public class NQueen2 {

    static void checkValidity(int[] valid, Stack stk, int n){
        int i =1;

        if(valid[i] == 1 || Integer.parseInt(stk.get(i-1).toString()) == 1){

                System.out.print(stk+" "+i);


        }

        else if(valid[i] != 1 && true){

        }

    }

    public static void main(String[] args){

        int n;
        System.out.println("Enter queen number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();



        for(int i=1;i<=n;i++){

            int[] valid = new int[n+1];
            valid[i] = 1;
            Stack<Integer> stk = new Stack<>();
            stk.push(i);


        }

    }
}
