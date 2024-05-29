package quiz2HanifFaishalHilmi;

public class DoubleLinkedList {
    Node head, tail;
    int size;
    
    DoubleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        head = head.n;
        head.p = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //Soal No 1 Kode Ganjil
    void addLast(int data){
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            int i = 0;
            while (current.n != null) {
                current = current.n;
                i++;
            }
            Node newNode = new Node(data);
            current.n = newNode;
            newNode.p = current;
        }
        size++;
    }
    //Soal No 1 Kode Genap
    void deleteLast(){
       
    }
    //Soal No 2 Kode Ganjil dan Genap
    void printFromTail(){
        if (isEmpty()) {
            System.out.println("List masih kosong");
        } else {
            Node current = tail;
            while (current != null) {
                System.out.print(""+current.data+"-");
                current = current.p;
            }
        }
    }
}
