package Backtracking;

import java.util.Scanner;

class NQueen2 {

    static int[] stk = new int[100];
    static int top = 0;
    static int[] valid = new int[100];

    public static int validSum(){

        int sum = 0;
        for(int i = 1;i<100;i++){
            sum = sum + valid[i];
        }
        return sum;
    }

    public static void printStack(){

        for(int i = 1; i <= top; i++){
            System.out.print(stk[i]+" ");
        }
    }


    public static boolean isSafe(int num, int lim, int length){

        if(valid[num] == 1){

            System.out.print("Backtrack from node: ");
            printStack();
            System.out.println(num);
            return false;
        }
        else{
            if(1 <= num && num <= lim){

                for(int m = 1, t = top; m < length+1; m++, t--){
                    if(Math.abs(stk[t] - num) == m){
                        System.out.print("Backtrack from node: ");
                        printStack();
                        System.out.println(num);
                        return false;
                    }
                }
            }
        }

        valid[num] = 1;
        top = top+1;
        stk[top] = num;
        return true;
    }

    public static void nQueen(int num, int total){

        int length = 1;
        int initial = 1;
        int p;
        top = top+1;
        stk[top] = num;
        valid[num] = 1;

        while(length != 0){

            if(validSum() == total){

                System.out.print("Solution: ");
                printStack();
                p = stk[top];
                stk[top] = 0;
                top = top-1;
                valid[p] = 0;
                length = length - 1;

                while (stk[top] == total){

                    p = stk[top];
                    stk[top] = 0;
                    top = top - 1;
                    valid[p] = 0;
                    length = length - 1;

                }
                  p = stk[top];
                stk[top] = 0;
                top = top - 1;
                valid[p] = 0;
                length = length - 1;
                initial = p + 1;
            }

            boolean k = isSafe(initial, total, length);
                if(k == false){

                    if(initial == total){

                        while(stk[top] == total && length != 1){

                            p = stk[top];
                            stk[top] = 0;
                            top = top-1;
                            valid[p] = 0;
                            length = length-1;
                        }
                        p = stk[top];
                        stk[top] = 0;
                        top = top-1;
                        valid[p] = 0;
                        length = length - 1;
                        initial = p+1;
                        continue;
                    }
                    else{
                        initial += 1;
                        continue;
                    }
                }
                else {
                    initial = 1;
                    length += 1;
                }
            }
        }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Enter queen's number: ");
        n = scanner.nextInt();

        for(int i =1; i<=n;i++){
            nQueen(i, n);
        }
    }
}
