package jobsheet13JFC.Mahasiswa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    void hapus(int index){
        mahasiswas.remove(index);
    }
    void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    // int linearSearch(String nim) {
    //     for (int i = 0; i < mahasiswas.size(); i++) {
    //         if (nim.equals((mahasiswas.get(i).nim))) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    int binarySearch(String nim) {
        int left = 0;
        int right = mahasiswas.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = nim.compareTo(mahasiswas.get(mid).nim);
            if (cmp == 0) {
                return mid;
            }
            else if (cmp > 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    void sortAsc() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }
    
    void sortDesc(){
        Collections.sort(mahasiswas, (mhs1,mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shanuum", "021xx3");

        lm.tambah(m,m1,m2);

        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
        
        System.out.println("");
        System.out.println("Sebelum sorting : ");
        lm.tampil();
        System.out.println("");
        
        System.out.println("");
        System.out.println("Setelah sorting ascend : ");
        lm.sortAsc();
        lm.tampil();
        System.out.println("");
        
        System.out.println("Setelah sorting descend : ");
        lm.sortDesc();
        lm.tampil();


    }
}
