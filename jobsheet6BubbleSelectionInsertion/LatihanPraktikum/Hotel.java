package jobsheet6BubbleSelectionInsertion.LatihanPraktikum;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    Hotel(String nama, String kota, int harga, byte bintang) {
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
    }
    
    void tampilHotel() {
        System.out.println("Nama Hotel : "+nama);
        System.out.println("Letak hotel : "+kota);
        System.out.println("Harga hotel : "+harga);
        System.out.println("Rating hotel : "+bintang);
    }
}
