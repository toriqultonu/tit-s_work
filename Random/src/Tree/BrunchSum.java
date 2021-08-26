package Tree;

import java.util.ArrayList;
import java.util.List;

public class BrunchSum {
    public static List<Integer> getSumArray(BinaryTree tree){
        List<Integer> array = new ArrayList<>();
        int sum  = 0;
        calculateSum(tree.root,sum,array);
        return array;
    }

    public static void calculateSum(Node node, int sum, List<Integer> array){

        if(node == null) {
            array.add(sum);
            return;
        }
        int newsum = node.key + sum;
        calculateSum(node.left, newsum, array);
        calculateSum(node.right,newsum, array);
//        if(node.left == null && node.right == null){
//            sum
//            return;
//        }
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
