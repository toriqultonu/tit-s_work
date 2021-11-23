package AlgoProbs;

import java.util.ArrayList;
import java.util.List;

class Level{

    public Node root;
    int depth;

    public Level(Node root, int depth){
        this.root = root;
        this.depth = depth;
    }
}

public class NodeDepth {

    public static int nodeDepths(Node root){

        int sumOfDepths = 0;
        List<Level> stack = new ArrayList<>();

        stack.add(new Level(root, 0));

        while (stack.size() > 0){
            Level top = stack.remove(stack.size() - 1);
            Node node = top.root;
            int depth = top.depth;
            if(node == null){
                continue;
            }
            sumOfDepths += depth;
            stack.add(new Level(node.left, depth+1));
            stack.add(new Level(node.right, depth+1));
        }
        return sumOfDepths;
    }

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println(nodeDepths(tree.root));
    }
}
