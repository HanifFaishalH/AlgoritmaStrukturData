public class TransaksiRental13 {
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double biaya;
    BarangRental13 br;

    TransaksiRental13(int kodeTransaksi, String namaPeminjam, int lamaPinjam, double biaya, BarangRental13 br) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.biaya = biaya;
        this.br = br;
    }

    public String getDetails() {
        return "Kode Transaksi: " + kodeTransaksi + ", Nama Peminjam: " + namaPeminjam + 
               ", Lama Pinjam: " + lamaPinjam + " hari, Biaya: " + biaya+ ", Kendaraan: " + br.getDetail();
    }
    public double getBiaya() {
        return biaya;
    }
}
