import java.util.Scanner;

public class Pegawai {
    public String nama;
    public int masaKerjaThn, gajiPokok;
    public double jamLembur;
    
    public Pegawai(String namPeg, int masKer,int gaPok){
        namPeg = nama;
        masKer = masaKerjaThn;
        gaPok = gajiPokok;
    }
    public double hitungGajiLembur (double gajiPokok){
        if (masaKerjaThn < 5) {
            return gajiPokok*0.05;
        } else {
            return gajiPokok*0.1;
        }
    }

    public double hitungTunjangan (double masaKerjaThn) {
        if (masaKerjaThn < 5) {
            return gajiPokok*0.25;
        } else {
            return gajiPokok*0.5;
        }
    }

    public double hitungGajiTotal() {
        return gajiPokok+hitungGajiLembur(gajiPokok)+hitungTunjangan(gajiPokok);
    }

    public void printData(){
        System.out.println("Nama : "+nama);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Gaji Lembur "+hitungGajiLembur(gajiPokok));
        System.out.println("Tunjangan : "+hitungTunjangan(gajiPokok));
        System.out.println("Total : "+hitungGajiTotal());
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pegawai : ");
        int jumPeg = input.nextInt();

        Pegawai pegawai[] = new Pegawai[jumPeg];

        for (int i = 0; i < pegawai.length; i++) {
            System.out.println("Nama pegawai ke - "+(i+1));
            String namPeg = input.next();

            System.out.println("Gaji Pokok pegawai ke - "+(i+1));
            int gaPok = input.nextInt();

            System.out.println("Masa kerja pegawai ke -"+(i+1));
            int masKer = input.nextInt();

            pegawai[i] = new Pegawai(namPeg, masKer, gaPok);
        }
        for (int i = 0; i < pegawai.length; i++) {
            pegawai[i].printData();
        }
        // for (int i = 0; i < pegawai.length; i++) {
        //     Pegawai gajiTerbesar = pegawai[i];
        //     if (pegawai[i+1] >= gajiTerbesar) {
        //         System.out.println(gajiTerbesar = pegawai[i+1]);
        //     } else {
        //         System.out.println(gajiTerbesar);
        //     }
        // }      
    }
}

