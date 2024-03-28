package jobsheet2;

public class latihan1 {
    String judul, pengarang;
    int halaman, stok, harga;
    double diskon;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Stok : "+stok);
        System.out.println("Harga : Rp"+harga);
    }
    void terjual(int jml){
        if (stok > 0 && stok >= jml) {
            stok-=jml;
        } else {
            System.out.println("Stok habis!");
        }
    }
    void restock(int jml){
        stok+=jml;
    }
    int hitungHargaTotal(int jml) {
        return harga*=jml;
    }
    int hitungDiskon(int jml){
        int diskon = 0;
        int hargajual = hitungHargaTotal(jml);
        if (hargajual >150000) {
            diskon = (int)(0.12*hargajual);
        } else if (hargajual < 150000 && hargajual> 75000) {
            diskon = (int)(0.05*hargajual);
        } else {
            diskon = 0;
        }
        return diskon;
    }
    int hitungHargaBayar(int jml){
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
    public static void main(String[] args) {
        latihan1 book = new latihan1();
        book.judul = "Today Ends Tomorrow Comes";
        book.pengarang = "Denanda Pratiwi";
        book.halaman = 198;
        book.stok = 13;
        book.harga = 71000;

        book.tampilInformasi();
        book.terjual(5);
        System.out.println("Harga total : "+book.hitungHargaTotal(5));
        System.out.println("Diskon : "+book.hitungDiskon(5));
        System.out.println("Harga bayar : "+book.hitungHargaBayar(5));
    }
}
