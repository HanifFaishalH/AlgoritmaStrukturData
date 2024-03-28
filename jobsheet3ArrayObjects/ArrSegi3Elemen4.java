package jobsheet3ArrayObjects;

class Segitiga {
    public double alas;
    public double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double HitungLuas (double a, double t) {
        return (a*t)/2;
    }
    
    public double CariSisiMiring (double a, double t) {
        return Math.sqrt(a*a + t*t);
    }

    public double HitungKeliling(double a, double t) {
        return alas+tinggi+CariSisiMiring(a, t);
    }
}
public class ArrSegi3Elemen4 {
    public static void main(String[] args) {
        Segitiga[] triangle = new Segitiga[4];

        triangle[0] = new Segitiga(10, 4);
        triangle[1] = new Segitiga(20, 10);
        triangle[2] = new Segitiga(15, 6);
        triangle[3] = new Segitiga(25, 10);

        for (int i = 0; i < triangle.length; i++) {
            System.out.println("Segitiga ke-"+i+" luas : "+triangle[i].HitungLuas(i, i)+", keliling : "+triangle[i].HitungKeliling(i, i));
        }
    }
}
