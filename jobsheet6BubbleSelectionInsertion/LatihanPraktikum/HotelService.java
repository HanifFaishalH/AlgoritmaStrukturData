package jobsheet6BubbleSelectionInsertion.LatihanPraktikum;

public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int i;

    void tambahHotel(Hotel h) {
        if (i<listHotel.length) {
            listHotel[i] = h;
            i++;
        } else {
            System.out.println("Data telah penuh");
        }
    }

    void tampilHotel() {
        for (Hotel h : listHotel) {
            h.tampilHotel();
            System.out.println("--------------");
        }
    }

    // bubble 
    void selectionHargaSort() {
        for (int i = 0; i < listHotel.length; i++) {
            int iHot = i;
            for (int j = i+1; j < listHotel.length; j++) {
                if (listHotel[j].harga < listHotel[iHot].harga) {
                    iHot = j;
                }
            }
            // swap
            Hotel tmp = listHotel[iHot];
            listHotel[iHot] = listHotel[i];
            listHotel[i] = tmp;
        }
    }

    // selection
    void selectionBintangSort() {
        for (int i = 0; i < listHotel.length; i++) {
            int iHot = i;
            for (int j = i+1; j < listHotel.length; j++) {
                if (listHotel[j].bintang > listHotel[iHot].bintang) {
                    iHot = j;
                }
            }
            // swap
            Hotel tmp = listHotel[iHot];
            listHotel[iHot] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
}
