package jobsheet10DLL.Tugas.No_2;

import java.util.Scanner;

public class filmMain {
    public static void menu() {
        System.out.println("==================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("==================");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data index tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID film");
        System.out.println("9. Urut data rating Film-Desc");
        System.out.println("10. Keluar");
        System.out.println("==================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        filmDLL ls = new filmDLL();

        do {
            menu();
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    System.out.print("ID film: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Judul film: ");
                    String judul = sc.nextLine();
                    System.out.print("Rating film: ");
                    double rating = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    ls.AddFirst(new film(id, judul, rating));
                    break;
                case 2:
                    System.out.println("Masukkan data film posisi akhir");
                    System.out.print("ID film: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Judul film: ");
                    judul = sc.nextLine();
                    System.out.print("Rating film: ");
                    rating = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    ls.AddLast(new film(id, judul, rating));
                    break;
                case 3:
                    System.out.println("Indeks untuk data film yang ingin ditambahkan: ");
                    int index = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("ID film: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Judul film: ");
                    judul = sc.nextLine();
                    System.out.print("Rating film: ");
                    rating = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    film film = new film(id, judul, rating);
                    ls.AddBasedIndex(index, film);
                    break;
                case 4:
                    ls.removeFirstFilm();
                    break;
                case 5:
                    ls.removeLastFilm();
                    break;
                case 6:
                    System.out.print("Index yang ingin dihapus: ");
                    index = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    ls.removeAtIndex(index);
                    break;
                case 7:
                    System.out.println("Daftar film yang ada: ");
                    ls.print();
                    break;
                case 8:
                    System.out.print("Masukkan nomor ID yang ingin dicari: ");
                    int ID = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    ls.findID(ID);
                    break;
                case 9:
                    ls.sortByRate();
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (true);
    }
}
