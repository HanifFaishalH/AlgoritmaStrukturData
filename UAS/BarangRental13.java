
public class BarangRental13 { //Membuat class dan atribut barang rental
    String TNKB, namaKendaraan, jenisKendaraan;
    int tahun, biayaSewa;
    
    //membuat konstruktor berparameter
    BarangRental13(String TNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.TNKB = TNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    //membuat method memanggil TNKB
    public String getLicensePlate() {
        return TNKB;
    }

    //membuat method memanggil print detail
    public String getDetail() {
        return "No TNKB: " + TNKB + ", Nama: " + namaKendaraan + ", Jenis: " + jenisKendaraan + ", Tahun: " + tahun + ", Harga: " + biayaSewa;
    }

    public String getTNKB() {
        return TNKB;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }
}