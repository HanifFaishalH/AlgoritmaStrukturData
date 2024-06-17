package jobsheet11Tree;

public class BinaryTreeArray13 {
    int[] data;
    int idxLast;

    public BinaryTreeArray13() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    //modifikasi nomor 5

    //method add 
    void add(int data) {
        if (idxLast < this.data.length - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree is full");
        }
    }

    //method traverse preorder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.println(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    //method traverse postorder
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.println(data[idxStart] + " ");
        }
    }
}
