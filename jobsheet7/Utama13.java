package jobsheet7;

import java.util.Scanner;

public class Utama13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Masukkan ukuran kapasitas gudang");
        int ukuran = sc.nextInt();

        Gudang13 gudang = new Gudang13(ukuran);


        while (true) {
            System.out.println("\nmenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang dengan nama");
            System.out.println("7. Keluar");
            System.out.println("Pilih operasi: ");
            int pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    gudang.findBarangWithScanner();
                case 7:
                    return;
                    default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
