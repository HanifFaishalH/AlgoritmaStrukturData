package jobsheet9LL.Tugas.Nomor1;

public class MhsSLL {
    Node head, tail;
    Mahasiswa data;
    int size;

    MhsSLL() {
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Daftar masih kosong");
        } else {
            Node tmp = head;
            System.out.println("Daftar Mahasiswa dan NIM : ");
            while (tmp != null) {
                tmp.data.printData();
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }

    void addFirst(Mahasiswa input) {
        Node newNode = new Node(input, null);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void addLast(Mahasiswa input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
            //tail.next = ndInput;
            //tail = ndInput;
        } else {
            //head = ndInput;
            //tail = ndInput;
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    void insertAfter (String key, Mahasiswa input){
        Node ndInput = new Node(input, null);//ganti new Node(input, null)
        Node temp = head;
        do{
            if(temp.data.nim == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { //ganti dengan ==
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
        while(temp != null);//ganti dengan !=
        size++;
    }

    void insertAt(int index, Mahasiswa input){
        //Node ndInput = new Node(input, null); //tidak usah
        if (index < 0){
            System.out.println("perbaiki logikanya!"
            + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else{
            Node temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
        size++;
    }


}
