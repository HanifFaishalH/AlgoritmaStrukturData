package jobsheet6BubbleSelectionInsertion;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int i;
    
    void tambah(Mahasiswa m) {
        if (i<listMhs.length) {
            listMhs[i] = m;
            i++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("--------------------");
        }
    }

    // //metode bubble
    // void bubbleSort() {
    //     for (int i = 0; i < listMhs.length-1; i++) {
    //         for (int j = 1; j < listMhs.length-i; j++) {
    //             if (listMhs[j].ipk > listMhs[j-1].ipk) {
    //                 Mahasiswa tmp = listMhs[j];
    //                 listMhs[j] = listMhs[j-1];
    //                 listMhs[j-1] = tmp;
    //             }
    //         }
    //     }
    // }

    // // metode selection
    // void selectionSort() {
    //     for (int i = 0; i < listMhs.length; i++) {
    //         int iMin = i;
    //         for (int j = i+1; j < listMhs.length; j++) {
    //             if (listMhs[j].ipk < listMhs[iMin].ipk) {
    //                 iMin = j;
    //             }
    //         }
    //         // swap
    //         Mahasiswa tmp = listMhs[iMin];
    //         listMhs[iMin] = listMhs[i];
    //         listMhs[i] = tmp;
    //     }
    // }

    // //metode insertion
    // void insertionSort() {
    //     for (int i = 0; i < listMhs.length; i++) {
    //         Mahasiswa temp = listMhs[i];
    //         int j = i;
    //         while (j>0 && listMhs[j-1].ipk > temp.ipk) {
    //             listMhs[j] = listMhs [j-1];
    //             j--;
    //         }
    //         listMhs[j] = temp;
    //     }
    // }

    // metode insertion sort descending
    void insertionSort() {
        for (int i = 0; i < listMhs.length; i++) {
            Mahasiswa temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs [j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
