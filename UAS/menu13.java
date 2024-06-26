import java.util.Scanner;

public class menu13 {
    static void menu(){
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Peminjaman");
        System.out.println("3. Tampilkan seluruh Transaksi");
        System.out.println("4. Urutkan Transaksi urut no TNKB");
        System.out.println("5. Keluar");
    }
    public static void main(String[] args) {
        boolean exit = false;
        fiturRental13 fitur = new fiturRental13();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilih) {
                case 1:
                    fitur.printData();
                    break;
                case 2:
                    fitur.pinjamKendaraan(sc);
                    break;
                case 3:
                    fitur.printSemuaTransaksi();
                    break;
                case 4:
                    fitur.urutkanTransaksi();
                    System.out.println("Fitur urutkan transaksi belum diimplementasikan.");
                    fitur.printSemuaTransaksi();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (!exit);

    }
}
