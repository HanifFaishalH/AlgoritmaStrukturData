package quiz2HanifFaishalHilmi;

public class Node {
    int data;
    Node n;
    Node p;
    
    public Node(){
        data=0;
        n = p = null;
    }
    
    public Node(int data){
        this.data = data;
        n = p = null;
    }
    
    public Node(Node prev, int data, Node next){
        this.data = data;
        this.n = next;
        this.p = prev;
    }
    
}
