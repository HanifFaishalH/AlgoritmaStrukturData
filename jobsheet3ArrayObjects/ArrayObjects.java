package jobsheet3ArrayObjects;

import java.util.Scanner;

class PersegiPanjang {
    public int panjang;
    public int lebar;
}

public class ArrayObjects {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan berapa array yang diinginkan");
        int sebut = sc.nextInt();
        PersegiPanjang[] ppArr = new PersegiPanjang[sebut];

        for (int i = 0; i < sebut; i++) {
            ppArr[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Masukkan Panjang : ");
            ppArr[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar");
            ppArr[i].lebar = sc.nextInt();
        }
        for (int i = 0; i < sebut; i++) {
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Panjang "+ppArr[i].panjang+", lebar "+ppArr[i].lebar);
        }
        sc.close();
    }
}