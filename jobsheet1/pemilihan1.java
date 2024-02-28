package jobsheet1;
import java.util.Scanner;

public class pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, total;
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.println("Masukkan nilai tugas : ");
        tugas = sc.nextDouble();
        System.out.println("Masukkan nilai kuis : ");
        kuis = sc.nextDouble();
        System.out.println("Masukkan nilai uts : ");
        uts = sc.nextDouble();
        System.out.println("Masukkan nilai uas : ");
        uas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        total = (tugas*0.1 + kuis*0.2 + uts*0.3 + uas*0.4);
        
        System.out.println("Nilai angka : " + total);

        System.out.println("==============================");
        System.out.println("==============================");
        sc.close();

        if (total >= 81 && total <= 100) {
            System.out.println("Nilai Huruf = A");
        } else if (total >= 74 && total <= 80) {
            System.out.println("Nilai Huruf = B+");
        } else if (total >= 66 && total <= 73) {
            System.out.println("Nilai Huruf = B");
        } else if (total >= 61 && total <= 65) {
            System.out.println("Nilai Huruf = C+");
        } else if (total >= 51 && total <= 60) {
            System.out.println("Nilai Huruf = C");
        } else if (total >=40 && total <= 50 ) {
            System.out.println("Nilai Huruf = D");
        } else if (total >=0 && total <= 39){
            System.out.println("Nilai Huruf E");
        } else {
            System.out.println("Nilai tidak valid");
        }

        String ket = (total >= 51 ) ? "Selamat anda lulus!" : "Sayang sekali, anda tidak lulus!";
        
        if (total >= 0 && total <=100) {
            System.out.println(ket);
        } else {
            
        }
        System.out.println("==============================");
        System.out.println("==============================");
    }
}