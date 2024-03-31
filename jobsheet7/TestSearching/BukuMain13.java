package jobsheet7.TestSearching;

import java.util.Scanner;

public class BukuMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuku = 5;

        System.out.println("----------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------");
            System.out.println("Kode Buku \t: ");
            int kodeBuku = sc.nextInt();
            System.out.println("Judul buku \t: ");
            String judulBuku = sc1.nextLine();
            System.out.println("Tahun terbit \t: ");
            int tahunTerbit = sc.nextInt();
            System.out.println("Pengarang \t:");
            String pengarang = sc1.nextLine();
            System.out.println("Stock \t:");
            int stock = sc.nextInt();

            Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        
        System.out.println("------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("_____________");
        System.out.println("_____________");
        System.out.println("Pencarian data");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.println("Kode buku : ");
        int cari = sc.nextInt();

        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
