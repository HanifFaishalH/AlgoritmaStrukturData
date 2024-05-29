package jobsheet10DLL.Tugas.No_2;

public class nodeFilm {
    nodeFilm next, prev;
    film dataFilm;

    public nodeFilm() {
        
    }

    public nodeFilm(nodeFilm prev, film dataFilm, nodeFilm next) {
        this.prev = prev;
        this.dataFilm = dataFilm;
        this.next = next;
    }
}
