package jobsheet11Tree;

public class BTArray13 {
    public static void main(String[] args) {
        BinaryTreeArray13 bta = new BinaryTreeArray13();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInorder Traversal :");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
