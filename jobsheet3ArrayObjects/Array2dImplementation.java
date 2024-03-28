package jobsheet3ArrayObjects;

class PersegiPanjang {
    public int panjang;
    public int lebar;
}

public class Array2dImplementation {
    public static void main(String[] args) {
        PersegiPanjang[] Arr = new PersegiPanjang[1];

        Arr[0] = new PersegiPanjang();
        Arr[0].panjang = 10;
        Arr[0].lebar = 5;

        System.out.println(Arr[0].panjang);
        System.out.println(Arr[0].lebar);
        
        for (int i = 0; i < 0; i++) {
            Arr[i] = new PersegiPanjang();
            System.out.println(Arr[i].panjang);
            System.out.println(Arr[i].lebar);
        }
    }
}