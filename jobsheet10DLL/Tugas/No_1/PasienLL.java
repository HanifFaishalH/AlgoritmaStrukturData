package jobsheet10DLL.Tugas.No_1;

public class PasienLL {
    NodeVaks head, tail;
    int size;

    PasienLL () {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addQueuePasien(Pasien input) {
        NodeVaks ndInput = new NodeVaks(null, input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            ndInput.prev = tail;
            tail = ndInput;
        }
        size++;
        System.out.println("Nama : "+input.nama);
        System.out.println("Antrian : "+(input.antrian));
    }

    public Pasien removeQueuePasien() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return null;
        } else {
            Pasien patient = head.dataPasien;
            head = head.next;
            if (head != null) {
                head.prev = null;
                size--;
            } else {
                tail = null;
            }
            size--;
            System.out.println("Antrian yang dihapus : "+patient.nama);
            System.out.println("Nomor antrian : "+patient.antrian);
            return patient;
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            NodeVaks temp = head;
            while (temp != null) {
                temp.dataPasien.printAntrianPasien();
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
