package jobsheet3ArrayObjects;

class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang*lebar*tinggi;
    }
}

public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blkArr= new Balok[3];

        blkArr[0] = new Balok(100, 30, 12);
        blkArr[1] = new Balok(120, 40, 15);
        blkArr[2] = new Balok(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke-"+i+" : "+blkArr[i].hitungVolume());
        }
    }
}
