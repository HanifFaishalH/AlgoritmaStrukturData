package jobsheet1;

import java.util.Scanner;

public class arrayCharKota {
    public static void main(String[] args) {
        char kodePlat;
        char plat[] = {'A','B','D','E','F','G','H','L','N','T'};
        String kota[][] = {
            {"B","A","N","T","E","N"},
            {"J","A","K","A","R","T","A"},
            {"B","A","N","D","U","N","G"},
            {"C","I","R","E","B","O","N"},
            {"B","O","G","O","R",},
            {"P","E","K","A","L","O","N","G","A","N"},
            {"S","E","M","A","R","A","N","G"},
            {"S","U","R","A","B","A","Y","A"},
            {"M","A","L","A","N","G"},
            {"T","E","G","A","L"}
        };
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan plat nomor : ");
        kodePlat = scan.next().charAt(0);

        int index = -1;
        for (int i = 0; i < plat.length; i++) {
            if (plat[i] == kodePlat) {
                index = 1;
                break;
            }
        }if (index != -1) {
            System.out.println("Kota dengan kode "+kodePlat+" : ");
            for (int j = 0; j < kota[index].length; j++) {
                System.out.println(kota[index+1][j]+" ");
            }
        } else {
            System.out.println("Kode plat "+kodePlat+" tidak ditemukan");
        }
        scan.close();
    } 
}
