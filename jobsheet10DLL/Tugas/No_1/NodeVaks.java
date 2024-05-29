package jobsheet10DLL.Tugas.No_1;

public class NodeVaks {
    Pasien dataPasien;
    NodeVaks prev, next;

    NodeVaks (NodeVaks prev, Pasien dataPasien, NodeVaks next) {
        this.next = next;
        this.prev = prev;
        this.dataPasien = dataPasien;
    }
}
