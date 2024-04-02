package jobsheet3ArrayObjects.Tugas;

import java.util.Scanner;

import jobsheet6BubbleSelectionInsertion.Mahasiswa;

public class InfoMahaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        InfoMahasiswa mhs[] = new InfoMahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke- "+ (i+1));
            System.out.println("Masukkan nama : ");
            String nama = sc2.nextLine();
            System.out.println("Masukkan NIM : ");
            int nim = sc.nextInt();
            System.out.println("Masukkan jenis kelamin : ");
            String kelamin = sc2.nextLine();
            System.out.println("Masukkan IPK : ");
            double ipk = sc.nextDouble();
            
            mhs[i] = new InfoMahasiswa(nama, kelamin, nim, ipk);
        }

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].print();
        }
        
        double averageIPK = mhs[0].CountAverage(mhs);

        System.out.println("Rata-rata IPK : "+averageIPK);

        double highestIPK = mhs[0].FindHighestIpk(mhs);
        System.out.println("IPK tertinggi adalah "+highestIPK);
    }
}
