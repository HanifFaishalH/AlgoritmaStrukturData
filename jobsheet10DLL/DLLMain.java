package jobsheet10DLL;

public class DLLMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // try {
        //     dll.add(40, 1);
        // } catch (Exception e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");

        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // dll.removeLast();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        // dll.remove(1);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("====================");
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("====================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("====================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("====================");
        System.out.println("Data awal linked list adalah "+dll.getFirst());
        System.out.println("Data akhir linked list adalah "+dll.getLast());
        System.out.println("Data indeks ke-1 linked list adalah "+dll.get(1));
    }
}
