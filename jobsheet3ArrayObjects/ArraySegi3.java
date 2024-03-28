package jobsheet3ArrayObjects;

import java.util.Scanner;

class Segitiga {
    public int alas;
    public int tinggi;

    public void Segitiga(int a, int t) {
        a = alas;
        t = tinggi;
    }
    
    int HitungLuas (int a, int t) {
        return (a*t)/2;
    }
    
    int KelilingStg (int a, int t) {
        return (int)Math.hypot(a, t);
    }
}
public class ArraySegi3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah array yang diinginkan : ");
        int jum = input.nextInt();
        Segitiga[] sgt = new Segitiga[jum];
        
        for (int i = 0; i < jum; i++) {
            sgt[i] = new Segitiga();
            System.out.println("Segitiga ke-" + (i+1));
            System.out.println("Masukkan alas ");
            sgt[i].alas = input.nextInt();
            System.out.println("Masukkan tinggi : ");
            sgt[i].tinggi = input.nextInt();
        }
        for (int i = 0; i < jum; i++) {
            System.out.println("Segitiga ke-" + (i+1) + " alas : " + sgt[i].alas + ", tinggi : " + sgt[i].tinggi);
        }
        input.close();
    }
}
