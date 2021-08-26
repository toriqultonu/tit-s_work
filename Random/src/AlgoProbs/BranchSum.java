package AlgoProbs;

import java.util.ArrayList;
import java.util.List;

class Node{

    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree(int key){
        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }

}

public class BranchSum {
    public static List<Integer> getSumArray(BinaryTree tree){
        List<Integer> array = new ArrayList<>();
        int sum  = 0;
        calculateSum(tree.root,sum,array);
        return array;
    }

    public static void calculateSum(Node node, int sum, List<Integer> array){

        if(node == null) return;

        int newsum = node.key + sum;

        if(node.left == null && node.right == null){
            array.add(newsum);
            return;
        }
        calculateSum(node.left,newsum,array);
        calculateSum(node.right,newsum,array);
    }
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println(getSumArray(tree));
    }
}
