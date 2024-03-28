package jobsheet2;

public class bukuMainKons13 {
    String judul, pengarang, Nama;
    int halaman, stok, harga;

    // public bukuMainKons13(){

    // }
    
    public bukuMainKons13(String jud, String pg, int hal, int stok, int har, String Name) {
        Nama = Name;
        judul = jud;
        pengarang = pg;
        halaman = hal;    
        this.stok = stok;
        harga = har; 
    }

    void tampilInformasi() {
        System.out.println("Nama " + Nama);
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

        bukuMainKons13 book2 = new bukuMainKons13("Self Reward", "Maheera Ayesha", 160, 29, 59000,"Wahyu");
        book2.terjual(5);
        book2.tampilInformasi();
    }
}
