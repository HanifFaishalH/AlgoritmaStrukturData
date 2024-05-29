package jobsheet9LL.Tugas.Nomor1;

public class Mahasiswa {
    String nama, nim;

    public Mahasiswa(){

    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void printData() {
        System.out.println("Nama = "+nama);
        System.out.println("NIM = "+nim);
    }
}
