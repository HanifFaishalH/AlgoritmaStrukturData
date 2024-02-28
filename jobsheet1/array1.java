package jobsheet1;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[8];
        String[] matkul = {"Pancasila", "Konsep Teknolgi Informasi", 
        "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", 
        "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Kesehatan dan Keselamatan Kerja"};
        String[] nHuruf = new String [8];
        double[] bNilai = new double [8]; 
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        double ip = 0;
        input.close();

        System.out.println("=============================================================");
        System.out.println("|               Program Menghitung IP Semester              |");
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("Masukkan nilai angka untuk mata kuliah:");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print(matkul[i] + ": ");
            nilai[i] = input.nextInt();

            while (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Input nilai salah! (0-100)");
                System.out.print(matkul[i] + ": ");
                nilai[i] = input.nextInt();
            }

            if (nilai[i] > 80 && nilai[i] <= 100) {
                nHuruf [i]= "A ";
                bNilai[i] = 4.00;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                nHuruf[i] = "B+";
                bNilai[i] = 3.50;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                nHuruf[i] = "B ";
                bNilai[i] = 3.00;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                nHuruf[i] = "C+";
                bNilai[i] = 2.50;
            } else if (nilai[i] > 50 && nilai[i] <= 60) {
                nHuruf[i] = "C ";
                bNilai[i] = 2.00;
            } else if (nilai[i] > 39 && nilai[i] <= 50) {
                nHuruf[i] = "D ";
                bNilai[i] = 1.00;
            } else {
                nHuruf[i] = "E ";
                bNilai[i] = 0;
            }
        }

        double jumN = 0;
        int sumSKS = 0;
        for (int i = 0; i < nilai.length; i++) {
            double sumN = bNilai[i] * sks[i];
            jumN += sumN; 
            sumSKS += sks[i];
        }
        ip = jumN / sumSKS;

         System.out.println();
         System.out.println("|                             Hasil Konversi Nilai                                 |");
         System.out.println("====================================================================================");
         System.out.println("|                   matkul                    | Nilai Angka | Nilai Huruf | Bobot Nilai|");
         System.out.println("|----------------------------------------------------------------------------------|");
         System.out.printf("| Pancasila                               |     %d      |     %s      |    %.2f    |\n", nilai[0], nHuruf[0], bNilai[0]);
         System.out.printf("| Konsep Teknologi Informasi              |     %d      |     %s      |    %.2f    |\n", nilai[1], nHuruf[1], bNilai[1]);
         System.out.printf("| Critical Thinking and Problem Solving   |     %d      |     %s      |    %.2f    |\n", nilai[2], nHuruf[2], bNilai[2]);
         System.out.printf("| Matematika Dasar                        |     %d      |     %s      |    %.2f    |\n", nilai[3], nHuruf[3], bNilai[3]);
         System.out.printf("| Bahasa Inggris                          |     %d      |     %s      |    %.2f    |\n", nilai[4], nHuruf[4], bNilai[4]);
         System.out.printf("| Dasar Pemrograman                       |     %d      |     %s      |    %.2f    |\n", nilai[5], nHuruf[5], bNilai[5]);
         System.out.printf("| Praktikum Dasar Pemrograman             |     %d      |     %s      |    %.2f    |\n", nilai[6], nHuruf[6], bNilai[6]);
         System.out.printf("| Keselamatan dan Kesehatan Kerja         |     %d      |     %s      |    %.2f    |\n", nilai[7], nHuruf[7], bNilai[7]);
         System.out.println("====================================================================================");
         System.out.printf("|                                  IP = %.2f                                       |\n", ip);
    }
}

