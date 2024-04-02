package jobsheet3ArrayObjects.Tugas;

public class InfoMahasiswa {
    String nama, kelamin;
    int nim;
    double IPK;

    InfoMahasiswa(String nama,String kelamin, int nim, double IPK) {
        this.nama = nama;
        this.kelamin = kelamin;
        this.nim = nim;
        this.IPK = IPK;
    }

    void print(){
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Jenis kelamin : "+kelamin);
        System.out.println("NIM : "+nim);
        System.out.println("IPK : "+IPK);
    }

    double CountAverage(InfoMahasiswa mhs[]) {
        double total = 0;
        for (InfoMahasiswa student : mhs) {
            total += student.IPK;
        }
        return total / mhs.length;
    }

    double FindHighestIpk(InfoMahasiswa mhs[]){
        double maxIPK = Double.MIN_VALUE;

        for (InfoMahasiswa mhsw : mhs) {
        if (mhsw.IPK > maxIPK) {
            maxIPK = mhsw.IPK;
            }
        }
        return maxIPK;
    }
}