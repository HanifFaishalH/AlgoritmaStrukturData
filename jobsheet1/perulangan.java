package jobsheet1;
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        int NIM;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan 2 angka terakhir NIM  anda : (Jika angka pertama 0, tulis angka terakhirnya saja)");
        NIM = input.nextInt();

        if (NIM < 10) {
            NIM+=10;
        }
        
        for (int i = 1; i <= NIM; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }

            if (i == 6 || i == 10) {
                continue;
            }
        }
        System.out.println();
        input.close();
    }
}

