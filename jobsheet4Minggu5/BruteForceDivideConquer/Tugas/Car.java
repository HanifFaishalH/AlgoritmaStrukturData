package jobsheet4Minggu5.BruteForceDivideConquer.Tugas;

public class Car {
    public String merk, tipe;
    public int tahun,accel,power;

    public Car (String merk, String tipe, int tahun, int accel, int power) {
        this.merk = merk;
        this.accel = accel;
        this.power = power;
        this.tahun = tahun;
        this.tipe = tipe;
    }

    public void displayCar () {
        
        System.out.println("===================");
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : "+ tipe);
        System.out.println("Tahun : "+tahun);
        System.out.println("Power : "+power);
        System.out.println("Akselerasi : "+accel);
        System.out.println("===================");
        System.out.println();
        
    }
    @Override
    public String toString() {
        return "Merk: " + merk + ", Tipe: " + tipe + ", Tahun: " + tahun + ", Power: " + power + ", Akselerasi: " + accel;
    }
}
