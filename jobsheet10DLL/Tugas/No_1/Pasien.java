package jobsheet10DLL.Tugas.No_1;

public class Pasien {
    String nama;
    int antrian;

    Pasien() {

    }

    Pasien (String nama, int antrian) {
        this.nama = nama;
        this.antrian = antrian;
    }

    void printAntrianPasien(){
        System.out.println("Nama : "+nama);
        System.out.println("Nomor antrian : "+antrian);
    }
}
