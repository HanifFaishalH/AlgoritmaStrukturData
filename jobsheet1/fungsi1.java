package jobsheet1;

public class fungsi1 {
    static String Bunga[] = {"Aglonema", "Keladi","Alocasia","Mawar"};
    static int stokBunga[][] = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };
    static int hrgBunga[]= {75000,50000,60000,10000};

    static void incomePerCabang() {
        System.out.println("Pendapatan per cabang jika ludes");
        for (int i = 0; i < stokBunga.length; i++) {
            int income[] = new int[4];
            for (int j = 0; j < stokBunga[0].length; j++) {
                income[i] += stokBunga[i][j] * hrgBunga[i];
            }
            System.out.println("Pendapatan cabang Royal Garden "+(i+1)+" sebesar : " +income[i]);
        }
    }
    static void stockCabang4() {
        int bungaMati[] = {1,2,0,5};
        int stokBaru[] = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            stokBaru[i] = stokBunga[3][i] - bungaMati[i];
            System.out.println(" > " + Bunga[i] + " : " + stokBaru[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("|    RINCIAN PENDAPATAN CABANG ROYAL GARDEN DAN STOCK BUNGA    |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println();
        System.out.println("1. Pendapatan setiap cabang jika semua bunga habis ");
        incomePerCabang();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("2. Jumlah stock setiap jenis bunga pada cabang royalgarden 4");
        stockCabang4();  
    }
}
