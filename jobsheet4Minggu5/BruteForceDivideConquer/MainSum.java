package jobsheet4Minggu5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program menghitung kentungan total (Satuan juta)");
        System.out.println("Masukkan jumlah bulan: ");
        int elm = input.nextInt();
        System.out.println("Masukkan jumlah perusahaan: ");
        int jumPer = input.nextInt();

        Sum[] perusahaan = new Sum[jumPer]; 

        for (int i = 0; i < jumPer; i++) {
            perusahaan[i] = new Sum(elm);
            System.out.println("=============================");
            System.out.println("Perusahaan ke-" + (i + 1));
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.println("Masukkan untung bulan ke-" + (j + 1) + " = ");
                perusahaan[i].keuntungan[j] = input.nextDouble();
            }
        }

        for (int i = 0; i < jumPer; i++) {
            System.out.println("=============================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("=======================");
            System.out.println("Brutal Force");
            System.out.println("Total keuntungan (Brute Force) = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));

            System.out.println("=======================");
            System.out.println("Divide and Conquer");
            System.out.println("Total keuntungan (Divide and Conquer) = " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen - 1));
        }
    }
}
