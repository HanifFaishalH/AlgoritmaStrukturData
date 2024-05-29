package UTS.KasusA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bank bank = new bank();
        Rekening r = new Rekening();
        do {
            Scanner s = new Scanner(System.in);
            
            System.out.println();
            System.out.println("------------------");
            System.out.println();
            System.out.println("Menu nasabah : ");
            System.out.println("1. Tambah rekening");
            System.out.println("2. Tampil semua rekening");
            System.out.println("3. Urutan rekening (besar-kecil)");
            System.out.println("4. Rekening yang saldonya kurang dari Rp50000");
            System.out.println("5. Cari rekening");
            System.out.println("6. Tarik tunai");
            System.out.println("7. Setor tunai");
            System.out.println();
            System.out.println("------------------");
            System.out.println();

            System.out.println("Pilih menu : ");
            int pilih = s.nextInt();

            switch (pilih) {
                case 1:
                    bank.tambahRekening(r);
                    break;
                case 2:
                    bank.tampilRekening();
                    break;
                default:
                    break;
            }
        } while (true);
    }
}