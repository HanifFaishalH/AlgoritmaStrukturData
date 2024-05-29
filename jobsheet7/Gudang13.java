package jobsheet7;

import java.util.Scanner;

public class Gudang13 {
    Barang13[] tumpukan;
    int size, top;

    public Gudang13(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang13[size];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    Barang13 ambilBarang() {
        if (!cekKosong()) {
            Barang13 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari Gudang");
            System.out.println("Kode unik dalam biner: "+konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    void tambahBarang (Barang13 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Gudang sudah penuh");
        }
    }

    Barang13 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang13 brgTeratas = tumpukan[top];
            System.out.println("Barang teratas "+brgTeratas.nama);
            return brgTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    Barang13 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang13 brgTerbawah = tumpukan[0];
            System.out.println("Barang terbawah adalah : "+brgTerbawah.nama);
            return brgTerbawah;
        } else {
            System.out.println("Tumpukan kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    String konversiDesimalKeBiner (int kode) {
        StackKonversi13 stack = new StackKonversi13();
        while (kode>0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode /2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner+=stack.pop();
        }
        return biner;
    }

    public Barang13 FindStuffSequential(String nama) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].nama.equals(nama)) {
                return tumpukan[i];
            }
        }
        return null;
    }
    
    public void findBarangWithScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari: ");
        String nama = scanner.nextLine();

        Barang13 barang = FindStuffSequential(nama);

        if (barang != null) {
            System.out.println("Barang " + barang.nama + " ditemukan pada tumpukan ke ");
        } else {
            System.out.println("Barang " + nama + " tidak ditemukan.");
        }
        scanner.close();
    }
}
