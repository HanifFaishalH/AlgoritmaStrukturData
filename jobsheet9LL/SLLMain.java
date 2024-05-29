package jobsheet9LL;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(760, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

        System.out.println("Data pada indeks ke-1= " + singLL.getData(1));
        System.out.println("Data 760 berada pada indeks ke-" + singLL.indexOf(999));
 
        // singLL.remove(760);
        // singLL.print();
        // singLL.removeAt(2);
        // singLL.print();
        // singLL.removeFirst();
        // singLL.print();
        // singLL.removeLast();
        // singLL.print();
        
    }
}
