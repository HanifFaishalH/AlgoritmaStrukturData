package jobsheet11Tree;

public class BinaryTreeMain13 {
    public static void main(String[] args) {
        BinaryTree13 bt = new BinaryTree13();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("PreO Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("IO Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("PostO Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete node 8");
        bt.delete(8);
        System.out.println("");
        System.out.println("PreOrder traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");


        BinaryTreeArray13 bta = new BinaryTreeArray13();
        bta.add(1);
        bta.add(2);
        bta.add(3);
        bta.add(4);
        bta.add(5);

        System.out.println("InOrder Traversal: ");
        bta.traverseInOrder(0);
        
        System.out.println("PreOrder Traversal: ");
        bta.traversePreOrder(0);
        
        System.out.println("PostOrder Traversal: ");
        bta.traversePostOrder(0);
    }
}
