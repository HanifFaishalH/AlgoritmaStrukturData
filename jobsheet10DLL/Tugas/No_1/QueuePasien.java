package jobsheet10DLL.Tugas.No_1;

import java.util.Scanner;

public class QueuePasien {
    public static void menu() {
        System.out.println("===========================");
        System.out.println("PENGANTRI VAKSI EXTRAVAGANZA");
        System.out.println("===========================");
        System.out.println();
        System.out.println("Menu :");
        System.out.println("1. Daftar antrian baru");
        System.out.println("2. Hapus antrian");
        System.out.println("3. Lihat antrian");
        System.out.println("4. Keluar");
    }
    public static void main(String[] args) {
        PasienLL opsi = new PasienLL();
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            menu();
            System.out.println("Pilih menu");
            int pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama pasien : ");
                    String nama = sc.nextLine();
                    System.out.println("Nomor antrian : ");
                    int antrian = sc.nextInt();
                    opsi.addQueuePasien(new Pasien(nama, antrian));
                    break;
                case 2:
                    if (opsi.size < 0) {
                        System.out.println("Antrian masih kosong");
                    } else {
                        opsi.removeQueuePasien();
                    }
                    break;
                case 3:
                    System.out.println("List antrian : ");
                    opsi.print();
                    System.out.println("Jumlah antrian : "+opsi.size);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                System.out.println("Input invalid!!");
                    break;
            }
        }
    }
}
