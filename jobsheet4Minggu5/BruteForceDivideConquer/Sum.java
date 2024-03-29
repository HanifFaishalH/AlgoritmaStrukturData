package jobsheet4Minggu5.BruteForceDivideConquer;

public class Sum {
    int elemen;
    double keuntungan[];

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
    }

    double totalBF(double arr[]) {
        double total = 0;
        for (int i = 0; i < elemen; i++) {
            total += arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2; // Correct middle index calculation
            double lsum = totalDC(arr, l, mid);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum; // No need to add arr[mid] again
        }
    }
}