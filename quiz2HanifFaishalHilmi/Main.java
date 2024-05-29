package quiz2HanifFaishalHilmi;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll = new DoubleLinkedList();
        DoubleLinkedList dll1 = new DoubleLinkedList();
        DoubleLinkedList dll2 = new DoubleLinkedList();

        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        System.out.println();

        dll1.addFirst(1);
        dll1.addFirst(3);
        dll1.addLast(2);

        dll2.addFirst(10);
        dll2.addFirst(30);
        dll2.addLast(20);

        System.out.println("head dll1 : "+dll1.head.data);
        System.out.println("tail dll1 : "+dll1.tail.data);

        System.out.println("head dll2 : "+dll2.head.data);
        System.out.println("tail dll2 : "+dll2.tail.data);

        System.out.println("Daftar 1 sebelum penggabungan:");
        dll1.print();
        System.out.println("Daftar 2 sebelum penggabungan:");
        dll2.print();

        merge(dll1, dll2);

        System.out.println("Daftar setelah penggabungan:");
        dll1.print();;

        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
    }
    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1, DoubleLinkedList dll2) {
        if (dll1.isEmpty()) {
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;

        } else if (!dll2.isEmpty()) {
            dll1.tail.n = dll2.head;
            dll2.head.p = dll1.tail;
            dll1.tail = dll2.tail;
        }
        dll1.size += dll2.size;
        dll2.head = null;
        dll2.tail = null;
        dll2.size = 0;
        
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }
}
