package AlgoProbs;

class BST{
    int value;
    BST left;
    BST right;
    BST(int value){
        this.value = value;
    }
}
public class ValidateBST {
    static boolean validateBST(BST tree, int minValue, int maxValue){

        if(tree.value < minValue || tree.value >= maxValue)
            return false;

        if(tree.left != null && !validateBST(tree.left, minValue, tree.value))
            return false;

        if(tree.right != null && !validateBST(tree.right, tree.value, maxValue))
            return false;

        return true;
    }

    public static void main(String[] args){

        BST bst = new BST(50);
        bst.left = new BST(30);
        bst.right = new BST(70);
        bst.left.left = new BST(50);
        bst.left.right = new BST(40);
        bst.right.left = new BST(60);
        bst.right.right = new BST(80);

        System.out.println(validateBST(bst, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
