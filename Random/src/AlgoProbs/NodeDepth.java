package AlgoProbs;

import java.util.Scanner;

class Program{

    class BinaryTree{

        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    class Level{

        BinaryTree root;
        int depth;

        public Level(BinaryTree root, int depth){
            this.root = root;
            this.depth = depth;
        }
    }

    public static int nodeDepth(BinaryTree root){
        int sumofDepth = 0;



        return sumofDepth;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int q = number/10;
        int r = number%10;
        int sum = 0;

        while(r != 0){
            sum = sum+r;
            r = q%10;
            q = q/10;
        }

        System.out.println("result: "+sum);
    }

}