package jobsheet6BubbleSelectionInsertion.LatihanPraktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService lsHotel = new HotelService();
        Hotel h1 = new Hotel("Grand Mercure", "Malang", 570000, (byte) 4);
        Hotel h2 = new Hotel("Harris Hotel", "Surabaya", 400000, (byte) 3);
        Hotel h3 = new Hotel("Naishvillette Hotel", "Solo", 295000, (byte) 1);
        Hotel h4 = new Hotel("Lux Ville", "Semarang", 478000, (byte) 5);
        Hotel h5 = new Hotel("Sananta Resort and Hotel", "Purwokerto", 305000, (byte) 2);

        lsHotel.tambahHotel(h1);
        lsHotel.tambahHotel(h2);
        lsHotel.tambahHotel(h3);
        lsHotel.tambahHotel(h4);
        lsHotel.tambahHotel(h5);

        System.out.println("Data urutan hotel berdasarkan harga =");
        lsHotel.selectionHargaSort();
        lsHotel.tampilHotel();

        System.out.println("Data mahasiswa setelah sorting selection berdasarkan rating bintang =");
        lsHotel.selectionBintangSort();
        lsHotel.tampilHotel();
        
    }
}
