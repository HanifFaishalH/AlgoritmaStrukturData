package jobsheet1;

import java.util.Scanner;

public class rumus {
    public static void htgKecepatan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jarak : (km)");
        double jarak = sc.nextDouble();
        System.out.println("Masukkan waktu : (jam)");
        double waktu = sc.nextDouble();
        double kecepatan = jarak/waktu;
        System.out.println("kecepatan = " +kecepatan);
    }
    public static void htgJarak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kecepatan : (km/jam)");
        double kecepatan = sc.nextDouble();
        System.out.println("Masukkan waktu : (jam)");
        double waktu = sc.nextDouble();
        double jarak = kecepatan*waktu;
        System.out.println("jarak = " +jarak);
    }
    public static void htgWaktu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jarak : (km)");
        double jarak = sc.nextDouble();
        System.out.println("Masukkan kecepatan : (km/jam)");
        double kecepatan = sc.nextDouble();
        double waktu = jarak/kecepatan;
        System.out.println("kecepatan = " +waktu);
    }
    static Scanner sc = new Scanner(System.in);
    static String menu[] = {" Hitung Kecepatan", " Hitung Jarak", " Hitung Waktu"};
    static boolean exit = true;
    public static void main(String[] args) {
        do {
            System.out.println("Pilih menu : ");
            for (int i = 1; i <= menu.length; i++) {
                System.out.println(i+" "+ menu[i-1]);
            }
            System.out.print(" =");
            char pilih = sc.next().charAt(0);

            switch (pilih) {
                case '1':
                    htgKecepatan();
                    break;
                case '2':
                    htgJarak();
                    break;
                case '3':
                    htgWaktu();
                case '4':
                exit=false;
                default:
                    System.out.println("Pilihan tidak sesuai dengan yang tersedia");
                    break;
            
        }
        } while (exit); 
    }
}
