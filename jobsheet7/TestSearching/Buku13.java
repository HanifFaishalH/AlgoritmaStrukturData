package jobsheet7.TestSearching;

public class Buku13 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku13 (int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    void tampilDataBuku(){
        System.out.println("==================");
        System.out.println("Kode buku :"+kodeBuku);
        System.out.println("Judul buku : "+judulBuku);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Pengarang :"+pengarang);
        System.out.println("Stock : "+stock);
    }
}
