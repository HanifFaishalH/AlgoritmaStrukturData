package jobsheet4Minggu5.BruteForceDivideConquer;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF() {
        int hasil = 0;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC() {
        if (pangkat == 1) {
            return nilai;
        } else {
            if (pangkat % 2 == 1) {
                return (pangkatDC() * pangkatDC() * nilai);
            } else {
                return (pangkatDC() * pangkatDC());
            }
        }
    }
}
