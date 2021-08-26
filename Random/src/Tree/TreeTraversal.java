package Tree;

public class TreeTraversal {

    public static void printPostOder(Node node){

        if(node == null)
            return;

        printPostOder(node.left);
        printPostOder(node.right);

        System.out.print(node.key + " ");
    }

    public static void printInOrder(Node node){

        if(node == null){
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key+" ");
        printInOrder(node.right);
    }

    public static void printPreOrder(Node node){

        if(node == null){
            return;
        }
        System.out.print(node.key +" ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.print("Preorder: ");printPreOrder(tree.root);
        System.out.println();
        System.out.print("Inorder: ");printInOrder(tree.root);
        System.out.println();
        System.out.print("Postorder: ");printPostOder(tree.root);
    }
}
