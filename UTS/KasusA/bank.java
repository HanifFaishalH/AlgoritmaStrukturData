package UTS.KasusA;

import java.util.Scanner;

public class bank {
    public Rekening[] rkng = new Rekening[11];
    int i = 0;
    Scanner sc = new Scanner(System.in);

    void tambahRekening(Rekening r) {
        
        System.out.println("Masuk rekening baru");
        System.out.println("Masukkan nomor rekening : ");
        String rek = sc.nextLine();
        System.out.println("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.println("Masukkan telefon nasabah : ");
        String telp = sc.nextLine();
        System.out.println("Masukkan E-mail nasabah : ");
        String email = sc.nextLine();
        System.out.println("Nominal saldo : ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        
        Rekening rekening = new Rekening(rek, nama, telp, email, saldo);
        
        if (i < rkng.length) {
            rkng[i] = rekening;
            i++;            
            } else {
            System.out.println("Rekening sudah penuh");
        }
    }

    void tampilRekening() {
        for (Rekening rekening : rkng) {
            if (rekening != null) {
                rekening.printRek();
            }
        }
    }
    
    void descendingSortRek() {
        for (int i = 0; i < rkng.length; i++) {
            Rekening temp = rkng[i];
            int j =i;
            while (j > 0 && rkng[j-i].saldo < temp.saldo) {
                rkng[j] = rkng [j-1];
                j--;
            }
            rkng[j] = temp;
        }
        for (Rekening rekening : rkng) {
            if (rekening != null) {
                rekening.printRek();
            }
        }
    }




}