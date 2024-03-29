package jobsheet4Minggu5.BruteForceDivideConquer;

import java.util.Scanner;

public class mainPangkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=====================");

        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = scan.nextInt();

        Pangkat[] pgk = new Pangkat[elemen];

        for (int i = 0; i < pgk.length; i++) {
            System.out.println("Elemen ke-" + (i + 1));
            System.out.println("Masukkan nilai yang akan dipangkatkan : ");
            int nilai = scan.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            int pangkat = scan.nextInt();

            pgk[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("pilih metode");
        int plh = scan.nextInt();
        switch (plh) {
            case 1:
                
            System.out.println("\nHasil pangkat Brute Force");
            for (int i = 0; i < pgk.length; i++) {
                System.out.println("Hasil dari " + pgk[i].nilai + " pangkat " + pgk[i].pangkat + " adalah " + pgk[i].pangkatBF());
            }
                break;
            
            case 2 :
                System.out.println("\nHasil pangkat Divide and Conquer");
                for (int i = 0; i < pgk.length; i++) {
                    System.out.println("Hasil dari " + pgk[i].nilai + " pangkat " + pgk[i].pangkat + " adalah " + pgk[i].pangkatDC());
                }
                break;
            
            default:
                break;
        }

    }
}
