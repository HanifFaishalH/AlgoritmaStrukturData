package jobsheet13JFC.Tugas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class NilaiMhsMain {

    static List<Mahasiswa> daftarMhs = new ArrayList<>();
    static List<MataKuliah> daftarMK = new ArrayList<>();
    static List<Nilai> daftarNilai = new ArrayList<>();
    static Queue<Mahasiswa> queueMHS = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        daftarMhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        daftarMK.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih;

        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println();
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("***********************************************");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    System.out.println();
                    tampilNilai();
                    break;
                case 3:
                    mencariNilai();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    hapusDataMahasiswa();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("pilihan menu tidak valid!");
            }
        } while (pilih != 6);
    }

    static void inputNilai() {
        System.out.println();
        System.out.println("Daftar Mahasiswa:");
        System.out.printf("%-15s%-15s%-15s%n", "NIM", "Nama", "Telf");
        for (Mahasiswa mhs : daftarMhs) {
            System.out.printf("%-15s%-15s%-15s%n", mhs.nim, mhs.nama, mhs.notelp);
        }

        System.out.print("Pilih mahasiswa by NIM: ");
        String nim = sc1.nextLine();
        Mahasiswa mahasiswa = cariMahasiswa(nim);
        if (mahasiswa == null) {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
            return;
        }

        System.out.println();
        System.out.println("Daftar Mata Kuliah:");
        System.out.printf("%-10s%-42s%-5s%n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : daftarMK) {
            System.out.printf("%-10s%-42s%-5d%n", mk.kode, mk.nama, mk.sks);
        }

        System.out.print("Pilih MK by kode: ");
        String kodeMK = sc1.nextLine();
        MataKuliah mataKuliah = cariMataKuliah(kodeMK);
        if (mataKuliah == null) {
            System.out.println("Mata kuliah dengan kode " + kodeMK + " tidak ditemukan.");
            return;
        }

        System.out.println();
        System.out.print("Masukkan nilai: ");
        double nilai = sc.nextDouble();
        System.out.println();

        Nilai nilaiMahasiswa = new Nilai(mahasiswa, mataKuliah, nilai);
        daftarNilai.add(nilaiMahasiswa);
        queueMHS.add(mahasiswa);
    }

    static Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mhs : daftarMhs) {
            if (mhs.nim.equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    static MataKuliah cariMataKuliah(String kode) {
        for (MataKuliah mk : daftarMK) {
            if (mk.kode.equals(kode)) {
                return mk;
            }
        }
        return null;
    }

    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*****************************");
        System.out.printf("%-15s%-15s%-42s%-10s%-5s%n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai nilai : daftarNilai) {
            System.out.print(nilai);
        }
        System.out.println();
    }

    static void mencariNilai() {
        System.out.println();
        tampilNilai();
        System.out.print("Masukkan data mahasiswa[nim] : ");
        String nim = sc1.nextLine();
        System.out.printf("%-15s%-15s%-42s%-10s%-5s%n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai nilai : daftarNilai) {
            if (nilai.mahasiswa.nim.equals(nim)) {
                System.out.print(nilai);
            }
        }
        System.out.println();
    }

    static void urutDataNilai() {
        System.out.println("1. Urutkan nilai secara Ascending");
        System.out.println("2. Urutkan nilai secara Descending");
        System.out.print("Pilih: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                Collections.sort(daftarNilai, Comparator.comparing(Nilai::getNilai));
                break;
            case 2:
                Collections.sort(daftarNilai, Comparator.comparing(Nilai::getNilai).reversed());
                break;
            default:
                System.out.println("pilihan tidak valid!");
        }
        tampilNilai();
    }

    static void hapusDataMahasiswa() {
        if (!queueMHS.isEmpty()) {
            Mahasiswa mahasiswa = queueMHS.poll();
            daftarMhs.remove(mahasiswa);
            daftarNilai.removeIf(nilai -> nilai.mahasiswa.equals(mahasiswa));
            System.out.println("Data mahasiswa dengan NIM " + mahasiswa.nim + " telah dihapus.");
        } else {
            System.out.println("Tidak ada data mahasiswa yang dapat dihapus.");
        }
        System.out.println();
    }
}