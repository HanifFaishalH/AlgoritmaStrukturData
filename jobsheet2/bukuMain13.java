package jobsheet2;

public class bukuMain13 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Stok : "+stok);
        System.out.println("Harga : Rp"+harga);
    }
    void terjual(int jml){
        if (stok > 0) {
            stok-=jml;
        } else {
            System.out.println("Stok habis!");
        }
    }
    void restock(int jml){
        stok+=jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    public static void main(String[] args) {
        bukuMain13 book = new bukuMain13();
        book.judul = "Today Ends Tomorrow Comes";
        book.pengarang = "Denanda Pratiwi";
        book.halaman = 198;
        book.stok = 13;
        book.harga = 71000;

        book.tampilInformasi();
        book.terjual(5);
        book.gantiHarga(60000);
        book.tampilInformasi();
    }
}
