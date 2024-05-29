package jobsheet8Queue.Praktikum2;

import java.util.Scanner;

public class NasabahMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("---------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Nasabah antri = new Nasabah(jumlah);

        System.out.println("Pilih operasi yang diinginkan : ");
        int pilih;
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nomor Rekening : ");
                    String norek = sc.nextLine();
                    System.out.println("Nama nasabah : ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat nasabah : ");
                    String alamat = sc.nextLine();
                    System.out.println("Umur nasabah : ");
                    int umur = sc.nextInt();
                    System.out.println("Saldo : ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.EnqueueNas(nb);
                    break;
                case 2:
                    Nasabah data = antri.DequeueNas();
                    if (!"".equals(data.norek)&&!"".equals(data.nama)&&!"".equals(data.alamat)&&data.umur != 0 && data.saldo !=0) {
                        System.out.println("Antrian yang dikeluarkan : " + data.norek);
                        }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
