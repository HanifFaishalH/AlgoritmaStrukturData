import java.util.Scanner;

public class fiturRental13 {
    BarangRental13 br[];
    TransaksiRental13[] tr;
    int jumlahTransaksi;

    fiturRental13() { //membuat array untuk barang rental dan batas kuota untuk peminjaman
        br = new BarangRental13[5]; 
        tr = new TransaksiRental13[10]; 
        jumlahTransaksi = 0;
    }

    //menampilkan semua kendaraan yang tersedia
    void printData() {
        br[0] = new BarangRental13("S 4567 YV", "Honda Beat", "Motor", 2017, 10000);
        br[1] = new BarangRental13("N 4511 VS", "Honda Vario", "Motor", 2018, 10000);
        br[2] = new BarangRental13("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000);
        br[3] = new BarangRental13("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000);
        br[4] = new BarangRental13("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000);

        for (BarangRental13 barangRental : br) {
            System.out.println(barangRental.getDetail());
        }
    }

    //input baru untuk peminjam baru
    void pinjamKendaraan(Scanner sc) {
        System.out.print("Kode Transaksi: ");
        int kodeTransaksi = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Nama Peminjam: ");
        String namaPeminjam = sc.nextLine();

        System.out.print("Lama Pinjam (/jam): ");
        int lamaPinjam = sc.nextInt();

        System.out.print("Biaya: ");
        double biaya = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Masukkan no TNKB kendaraan: ");
        String TNKB = sc.nextLine();

        BarangRental13 selectedVehicle = null;
        for (BarangRental13 barangRental : br) {
            if (barangRental != null && barangRental.getTNKB().equalsIgnoreCase(TNKB)) {
                selectedVehicle = barangRental;
                break;
            }
        }

        if (selectedVehicle != null) {
            if (jumlahTransaksi < tr.length) {
                // Hitung biaya berdasarkan waktu pinjam * biaya sewa per jam
                double biayaTotal = lamaPinjam * selectedVehicle.getBiayaSewa();

                tr[jumlahTransaksi] = new TransaksiRental13(kodeTransaksi, namaPeminjam, lamaPinjam, biayaTotal, selectedVehicle);
                jumlahTransaksi++;
                tr[jumlahTransaksi].biaya = biayaTotal; 
                
                // Menampilkan informasi peminjaman
                System.out.println("Peminjaman berhasil!");
                System.out.println("Biaya total yang harus dibayar: " + biayaTotal);
            } else {
                System.out.println("Maksimum transaksi tercapai!");
            }
        } else {
            System.out.println("Kendaraan tidak ditemukan!");
        }

    }

    //menampilkan semua transaksi yang telah dilakukan
    void printSemuaTransaksi() {
        for (int i = 0; i < jumlahTransaksi; i++) {
            TransaksiRental13 transaksi = tr[i];
            System.out.println(transaksi.getDetails() + ", Biaya Total: " + transaksi.biaya);
        }
    }

    //menampilkan urutan transaksi yang telah terjadi desc
    void urutkanTransaksi() {
        // Implementasi pengurutan dengan pendekatan manual
        for (int i = 0; i < jumlahTransaksi - 1; i++) {
            for (int j = i + 1; j < jumlahTransaksi; j++) {
                // Bandingkan nama peminjam secara descending
                if (tr[i].namaPeminjam.compareTo(tr[j].namaPeminjam) < 0) {
                    // Jika nama peminjam tr[i] < tr[j], tukar posisi
                    TransaksiRental13 temp = tr[i];
                    tr[i] = tr[j];
                    tr[j] = temp;
                }
            }
        }
    }
}
